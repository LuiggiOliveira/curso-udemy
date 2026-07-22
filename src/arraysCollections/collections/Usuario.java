package arraysCollections.collections;

import java.util.Objects;

public class Usuario {
    String nome;

    Usuario(String nome) { this.nome = nome;}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }

    @Override //no caso do ArrayList, ele não irá utilizar o hashCode()
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return "Meu nome é " + this.nome + ".";
    }
}
