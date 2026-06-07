package arraysCollections.equalsHashcode;

import java.util.Objects;

public class Usuario {
    String nome;
    String email;

    @Override
    public boolean equals(Object obj) { //o Object é o topo do que é mais genérico do java, a raíz de todos os objetos (classe-mãe)

        if (obj instanceof Usuario){
            Usuario outro = (Usuario) obj;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }
        else {
            return false;
        }
    }

    //não é nessa aula ainda o hashcode, mas...
    //USAR ALT + INSERT -> equals() and hashCode() -> escolher atributos
    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}
