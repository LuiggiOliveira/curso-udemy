package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        Connection conexao = FabricaConexao.getConexao();

        System.out.print("Digite o ID da pessoa a ser removida: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Você deseja realmente excluir? (Se sim digite 's', caso contrário digite qualquer coisa)");
        String confirmar = sc.nextLine();

        // Se eu colocar um id inexistente, o SQL ou pelo menos o MySQL executa o comando normalmente e não retorna mensagem de erro
        if (confirmar.equalsIgnoreCase("s") || confirmar.equalsIgnoreCase("sim") ) {

            String deleteSQL = "DELETE FROM tbPessoas WHERE id = ?";
            PreparedStatement pstmt = conexao.prepareStatement(deleteSQL);
            pstmt.setInt(1, id);

            // com executeUpdate(), ele vai retornar o número de linhas afetadas... Aí sim eu consigo saber se retornou um id que existe ou não na tabela
            if (pstmt.executeUpdate() > 0) { // ou != 0
                System.out.println("Pessoa removida com sucesso!");

            } else {
                System.out.println("Nada feito, pois o ID é inexistente na tabela.");
            }

            pstmt.close();
        } else {
            System.out.println("Você desistiu de excluir.");
        }

        // obs: para imprimir a quantidade de linhas afetadas, pode-se fazer, por exemplo: int linhasAfetadas = psmtm.executeUpdate();

        conexao.close();
        sc.close();
    }
}
