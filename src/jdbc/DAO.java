package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO { // padrão Objeto de Acesso a Dados -> Data Access Object que lembra muito o conceito da arquitetura MVC
    // DAO para encapsular o processo de inclusão
    private Connection conexao;

    public int incluir (String sql, Object... atributos) {
        try {
            PreparedStatement pstmt = getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            adicionarAtributos(pstmt, atributos);

            if (pstmt.executeUpdate() > 0) {
                ResultSet resultado = pstmt.getGeneratedKeys();

                if (resultado.next()) {
                    return resultado.getInt(1);
                }
            }

            return -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            getConexao().close();
        } catch (SQLException e) {

        } finally {
            conexao = null;
        }
    }

    private void adicionarAtributos(PreparedStatement pstmt, Object[] atributos) throws SQLException {

        int indice = 1;
        for (Object atributo : atributos) {
            if (atributo instanceof String) {
                pstmt.setString(indice, (String) atributo);
            } else if (atributo instanceof Integer) {
                pstmt.setInt(indice, (Integer) atributo);
            } else if (atributo instanceof Double) {
                pstmt.setDouble(indice, (Double) atributo);
            } else if (atributo instanceof Boolean) {
                pstmt.setBoolean(indice, (Boolean) atributo);
            }

            indice++;
        }
    }

    private Connection getConexao() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                return conexao;
            }
        } catch (SQLException e) {

        }

        conexao = FabricaConexao.getConexao();
        return conexao;
    }
}
