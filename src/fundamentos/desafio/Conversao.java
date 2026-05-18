package fundamentos.desafio;

import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double d = sc.nextDouble(); //aqui só está aceitando vírgula -> 200,50 (até porque é input de um número)
        System.out.println(d);
        sc.nextLine();
        System.out.println("Digite o primeiro salário:"); //a partir daqui já se usa 2003.512 (já que é input que recebe String)
        String salario1 = sc.nextLine();
        System.out.println("Digite o segundo salário:");
        String salario2 = sc.nextLine();
        System.out.println("Digite o terceiro salário:");
        String salario3 = sc.nextLine();

        double d1 = Double.parseDouble(salario1); //porém quando a String do número com ponto chega aqui, dá erro
        double d2 = Double.parseDouble(salario2); //já que System.out.println(Locale.getDefault()) mostra que está em  pt-br
        double d3 = Double.parseDouble(salario3);
        double media = (d1+d2+d3)/3;

        System.out.printf(
                """
                Últimos salários do funcionário:
                1. R$%.2f,
                2. R$%.2f, e
                3. R$%.2f
                
                Média: R$%.2f
                """, d1, d2, d3, media);
        sc.close();

    }
}
