package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Opa galera".charAt(6)); //'l'

        String a = "ALGUMA COISA";
        String b = "Boa noite";
        System.out.println(b);
        b = b.toUpperCase(); //substitui, mas nao modifica o valor original
        System.out.println(b);
        b = "alguma coisa"; //modifica o valor original
        System.out.println(b);
        System.out.println(b.startsWith("Boa")); //É tipo um LIKE no SQL (WHERE msg LIKE "Boa%";)
        System.out.println(b.endsWith("isa")); //(WHERE msg LIKE "%Boa";)
        System.out.println(b.length());
        System.out.println(b.equals(a));
        System.out.println(b.equalsIgnoreCase(a)); //ignora caixa alta

        var nome = "Pedrinho";
        var sobrenome = " Santos".toUpperCase();
        String frase = String.format("%s%s\n",nome,sobrenome);
        String frase2 = nome + sobrenome;

        // OBS: sobre o .concat():
        // Se uma das strings for null, o operador + tratará o valor como a string literal "null".
        // Já o .concat() lançará uma exceção NullPointerException.
        System.out.println(nome.concat(sobrenome)); // além disso é mais limpo sintaticamente do que '+', pois permite encadeamento
        System.out.printf("%s%s\n",nome,sobrenome);
        System.out.println(frase2);
        System.out.println(frase);

        System.out.println(nome.contains("drin")); //equivalente também a LIKE "Pedrinho" do SQL
        System.out.println(nome.indexOf("r"));
        System.out.println(nome.indexOf("n"));
        System.out.println("Boa noite turma".substring(4));
        System.out.println("Boa noite turma".substring(4, 9));
//      ctrl + / para add comentários mais rápido (lembrei agora disso)

    }
}
