package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();

        String sql = "SELECT * FROM tbPessoas;";

        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql); // -> retorna ResultSet

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()) { //seleciona no banco, se tiver algo então retorna TRUE, caso contrário FALSE
            int id = resultado.getInt("id");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(id, nome));
        }

        for (Pessoa p : pessoas) {
            System.out.println(p.getId() + " | " + p.getNome());
        }

        stmt.close();
        conexao.close();
    }
}
