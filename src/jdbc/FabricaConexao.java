package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

    public static Connection getConexao() {
        // agora, os dados estão fora do código e seguros no arquivo textual terminado em ".properties"
        // lembrando também que deve estar no ".gitignore" para não enviar para o github os arquivos ".properties"
        try {
            Properties prop = getProperties();
            final String url = prop.getProperty("banco.url");
            final String usuario = prop.getProperty("banco.usuario");
            final String senha = prop.getProperty("banco.senha");
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    //lê arquivo e pega as chaves dentro do arquivo .properties de uma forma mais intuitiva
    private static Properties getProperties() throws IOException {
        Properties prop = new Properties();

//      String currentUserHomeDir = System.getProperties("user.home"); -> baseado no sistema operacional
        String path = "/conexao.properties";
        prop.load(FabricaConexao.class.getResourceAsStream(path));

        return prop;
    }
}
