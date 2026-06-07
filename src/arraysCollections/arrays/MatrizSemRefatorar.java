package arraysCollections.arrays;

import java.util.Locale;
import java.util.Scanner;

public class MatrizSemRefatorar {
    //TODO REFATORAR ESSE CÓDIGO DIVIDINDO ELE EM MÉTODOS
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //lembrar de colocar isso porque toda hora esqueço que tem que pôr vírgula...

        System.out.println("Informe a quantidade de notas a ser passada:");
        int qtd_notas = sc.nextInt();

        System.out.println("Informe a quantidade de alunos :");
        int qtd_alunos = sc.nextInt();
        double[][] notasAluno = new double[qtd_alunos][qtd_notas];
        String[] nomeAluno = new String[qtd_alunos];

        sc.nextLine();

        System.out.println("\nInserindo os nomes dos alunos que irão receber as notas...");
        for (int i = 0; i < qtd_alunos; i++) {
            System.out.printf("Digite o nome do Aluno %d: ", i+1);
            nomeAluno[i] = sc.nextLine();
        }

        System.out.println("\nPreenchendo as notas de cada aluno...");
        for (int i = 0; i < qtd_alunos ; i++) {
            System.out.printf("Insira agora as notas do aluno '%s'\n", nomeAluno[i]);
            for (int j = 0; j < qtd_notas; j++) {
                System.out.printf("Nota %d: ", j+1);
                notasAluno[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\nImprimindo as notas e a média final de cada aluno...");
        for (int i = 0; i < qtd_alunos; i++) {
            double media = 0;
            System.out.printf("%s: { ",nomeAluno[i]);

            for (int j = 0; j < qtd_notas; j++) {
                System.out.printf("%.2f; ", notasAluno[i][j]);
                media += notasAluno[i][j];
            }

            System.out.printf("} -> Média final: %.2f\n", media/qtd_notas);
        }

        sc.close();
    }
}
