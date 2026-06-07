package estruturas_controle.exercicio;

// Criar um programa informa se o ano atual é um ano bissexto;

import java.util.Scanner;

public class EhBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano para verificar se ele é bissexto: ");
        int ano = sc.nextInt();
        boolean ehBissexto = (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
        String resultado = ehBissexto ? "É bissexto!" : "Não é bissexto...";
        //pode parecer estranho as condições, mas tá certinho porque ser divisível por 400, deixa implícito que
        //é divisível por 100 e por 4 ao mesmo tempo

        System.out.println(resultado);

        sc.close();
    }
}
