package arraysCollections.arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class DesafioArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //lembrar de colocar isso porque toda hora esqueço que tem que pôr vírgula...

        System.out.println("Informe a quantidade de notas a ser passada:");
        int tamanho = sc.nextInt();
        double[] notasAluno = new double[tamanho];
        double media = 0;

//      O desafio pede parar criar dois "for" ao invés de somente um,
//      se não seria só ir somando à média conforme fosse adicionando as notas. Ou seja:
//      for (int i = 0; i < tamanho; i++) {
//          notasAluno[i] = sc.nextDouble();
//          media += notasAluno[i]
//      }

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Insira o valor da %dª nota: ", i+1);
            notasAluno[i] = sc.nextDouble();
        }

        System.out.println("Calculando a média das notas...");
        for (double v : notasAluno) {
            media += v;
        }

        media /= tamanho;

        System.out.printf("NOTAS DO ALUNO: %s\n", Arrays.toString(notasAluno));
        System.out.printf("Média final: %.2f", media);
        sc.close();

    }
}
