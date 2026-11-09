package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class NovaPessoa {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        // !!! NESSE CASO, SERIA FÁCIL UM ATAQUE POR SQL INJECTION !!!
        // no input teria algo do tipo -> jubileu');delete from tbpessoas where ('1'='1');
        System.out.print("Informe o nome: ");
        String nome = sc.nextLine();

        Connection conexao = FabricaConexao.getConexao();

//      String sql = "INSERT INTO tbPessoas (nome) VALUES ('" + nome + ')";
//      Statement stmt = conexao.createStatement();

        String sql = "INSERT INTO tbPessoas (nome) VALUES (?);";
        PreparedStatement stmt = conexao.prepareStatement(sql); // mais seguro por não concatenar diretamente o input
        stmt.setString(1, nome); // vai garantir que tudo ali de fato seja apenas String e não um comando SQL

        stmt.execute(); // DESSA VEZ NÃO ESCREVI ".execute(sql)"

        System.out.println("Um novo registro da tabela Pessoas foi adicionado com sucesso!");

        conexao.close();
        sc.close();
    }
}
