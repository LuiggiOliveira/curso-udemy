package estruturas_controle.exercicio;

// Refatorar o exercício 04 (EhPrimo), utilizando a estrutura switch.

import java.util.Scanner;

public class RefatorarEhPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo para saber se ele é primo");
        int primo = sc.nextInt(); //982451653 (demorou uns 2 segundos para finalizar o programa, após o input é claro)
        int divisores = 0;

        if (primo < 1 ) System.out.println("É um número negativo. Digite um inteiro positivo");

        for (int i = 1; i <= primo; i++){
            if (primo % i == 0) divisores++;
        }

        switch (divisores){
            case 1:
                System.out.println("O número 1 é o único número que tem 1 divisor, que é ele mesmo. Ou seja, não é primo!");
                break;
            case 2:
                System.out.println("É primo! Pois apenas números primos possuem 2 divisores, sendo divisível por ele mesmo e por 1.");
                break;
            default:
                System.out.println("Não é primo! Pois o número de divisores é maior que 2.");
        }

        System.out.println("Curiosidade: o número zero é o único que possui infinitos divisores, já que 0 dividido " +
                "por qualquer número resulta em 0, uma vez que todo número multiplicado por zero resulta em zero!" +
                " 'Matemática é arte, o resto é só fazer conta.'");
        sc.close();
    }
}
