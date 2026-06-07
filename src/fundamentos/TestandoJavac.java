package fundamentos;

import java.util.Scanner;

public class TestandoJavac {
    public static void main(String[] x) {
        System.out.println("Isso realmente funciona?");

        Scanner sc = new Scanner(System.in);
        String funciona = sc.nextLine();

        System.out.println("Respondendo a pergunta: " + funciona);
        System.out.println(x);
        //ao digitar no cmd da pasta raíz do TestandoJavac.java, após compilar para .class, uso java Teste alguma_coisa
        System.out.println(x[0]); //aí no fim printa x[0] que é justamente "alguma_coisa", que seria o args do "main(String[] args)"
        //ou seja, consigo passar parâmetros para meu programa java
        sc.close();
    }
}
