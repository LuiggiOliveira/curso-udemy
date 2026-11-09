package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class TesteConexao {

    public static void main(String[] args) throws SQLException {

        // consigo conectar com um banco em específico colocando ele após localhost:3306/(nome) + parâmetros de segurança de conexão
        final String url = "jdbc:mysql://localhost?VerifyServerCertificate=false&useSSL=true"; //ou nesse caso, poderia deixar explícito a porta padrão (localhost:3306)
        final String usuario = "root";
        final String senha = "MINHA_SENHA_AQUI"; // jamaisss colocar senha hardcoded!!!!!!!!!!!!!!!!!!!!!!!!!!

        Connection conexao = DriverManager
                .getConnection(url, usuario, senha); //EXCEÇÃO CHECADA -> herda diretamente de Exception

        System.out.println("Conexão efetuada com sucesso!");
        conexao.close();
    }
}
