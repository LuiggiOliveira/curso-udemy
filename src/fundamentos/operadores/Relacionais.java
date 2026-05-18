package fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {
        // OBSERVAÇÃO SOBRE UMA PECULIARIDADE DO JAVA
        int a = 97;
        int b = 'a'; //atribui o "id" do 'a' na tabela do Unicode
        System.out.println(b);

        System.out.println(a == b);
        System.out.println('\u0061'); // obs: \u0097 -> 97 em hexadecimal é 61 -> 0061 -> então \u0061

        System.out.println(3 > 6);
        System.out.println(3 >= 3);
        System.out.println(40 < 100);
        System.out.println(30 <= 15);
        System.out.println(10 != 1);

        double nota = 10;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        System.out.println("Tem desconto: " + temDesconto);

    }
}
