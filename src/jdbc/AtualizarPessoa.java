package jdbc;

import java.sql.*;
import java.util.Scanner;

public class AtualizarPessoa {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o código da pessoa: ");
        int codigo = input.nextInt();

        String selectSQL = "SELECT id, nome FROM tbPessoas WHERE id = ?";
        String updateSQL = "UPDATE tbPessoas SET nome = ? WHERE id = ?"; //eu pensei de concatenar -> codigo <- porém, qual index eu colocaria em setString?

        PreparedStatement pstmt = conexao.prepareStatement(selectSQL);
        pstmt.setInt(1, codigo);

        ResultSet resultado = pstmt.executeQuery();

        if(resultado.next()) { // obs: no .getInt() e .getString() eu posso passar ou o label das colunas ou o index
            Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));

            System.out.printf("O nome dessa pessoa de código %d é %s\n", codigo, resultado.getString("nome"));
            System.out.println("Agora digite para qual valor deve ser alterado na coluna 'nome' para esta pessoa: ");
            input.nextLine(); //limpando buffer...
            String nomeAtualizado = input.nextLine();

            pstmt.close(); //fecha a statement da query do select

            pstmt = conexao.prepareStatement(updateSQL);
            pstmt.setString(1, nomeAtualizado);
            pstmt.setInt(2, codigo);
            pstmt.execute();

            System.out.println("Pessoa alterada com sucesso!");
            pstmt.close();
        } else {
            System.out.println("Pessoa não encontrada...");
        }

        input.close();
        conexao.close();
    }
}
