package jdbc;

public class DAOTeste {

    public static void main(String[] args) {

        DAO dao = new DAO();

        String sql = "INSERT INTO tbPessoas (nome, id) VALUES (?, ?)";
//        dao.incluir(sql, "Julia Ana");
//        dao.incluir(sql, "Ana Julia");
//        dao.incluir(sql, "Ana Juliana");
//        dao.incluir(sql, "Maria Juliana");

        System.out.println(dao.incluir(sql, "Juliano", 56));
        System.out.println(dao.incluir(sql, "Julio", 57));

        dao.close();
    }
}
