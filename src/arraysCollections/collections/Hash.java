package arraysCollections.collections;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {

        HashSet<Usuario> usuario = new HashSet<Usuario>();

        usuario.add(new Usuario("Pedro"));
        usuario.add(new Usuario("Ana"));
        usuario.add(new Usuario("Marcos"));

        boolean resultado = usuario.contains(new Usuario("Marcos"));
        System.out.println(resultado);

        // Sempre implementar o equals() e o hashCode() para que estruturas que utilizem eles não quebrem. Podendo ser
        // gerado (alt + insert) pela própria IDE.
    }
}
