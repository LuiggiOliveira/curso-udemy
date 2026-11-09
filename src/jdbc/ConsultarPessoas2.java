package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
    //obs: acabei cometendo 3 erros nesse desafio -> esqueci do WHERE nome, eu estava muito em dúvida na questão da interrogação
    // sobre usar '%?%' e esquecer de que não deveria passar a variável que armazena a query SQL dentro do .executeQuery()

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();
        Scanner input = new Scanner(System.in);

        System.out.print("Digite qual letra (usando %) deve estar presente nos nomes dessa consulta: ");
        String letrasConsultadas = input.nextLine();

        // não pode colocar '%?%', até porque assim fica mais flexível para o usuário escolher como utilizar a '%'
        String sql = "SELECT * FROM tbPessoas WHERE nome LIKE ?";

        PreparedStatement pstmt = conexao.prepareStatement(sql); // não passar 'sql' dentro de .executeQuery()!!
        pstmt.setString(1, letrasConsultadas); // aqui eu poderia colocar pstmt.setString(1, "%" + letrasConsultadas + "%")

        ResultSet resultado = pstmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()) {
            int id = resultado.getInt("id");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(id, nome));
        }

        for (Pessoa p : pessoas) {
            System.out.println(p.getId() + " | " + p.getNome());
        }

        input.close();
        pstmt.close();
        conexao.close();
    }
}
