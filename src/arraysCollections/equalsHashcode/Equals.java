package arraysCollections.equalsHashcode;

import java.util.Date;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@email.com";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@email.com";

        Usuario u3 = new Usuario();
        u3.nome = "Silvano";
        u3.email = "silva123@email.com";

        //irão comparar os endereços dos objetos por padrão
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        System.out.println(u2.equals(new Date()));

        System.out.println("Hashcode com base no nome e email:");
        System.out.println("u1: " + u1.hashCode());
        System.out.println("u2: " + u2.hashCode());
        System.out.println("u3: " + u3.hashCode());
    }
}
