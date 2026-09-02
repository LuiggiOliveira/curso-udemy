package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

    //eu posso usar como uma classe normal, ou como uma interface, ou ainda como uma classe normal, mas utilizando um construtor private
    //para que eu não instancie essa classe
    private Utilitarios() {

    }

    public final static UnaryOperator<String> maiuscula = String::toUpperCase;
    public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";

    public final static String grito(String n) {
        return n + "!!! ";
    }
}
