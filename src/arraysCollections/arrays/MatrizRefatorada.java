package arraysCollections.arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*
 * Ao refatorar o código eu consigo criar mais matrizes e listas de nomes para cada sala de aula (neste exemplo é claro).
 * Assim reutilizo o código apenas chamando os métodos. E para melhorar ainda mais isso, já que nesse caso se assemelha
 * ao paradigma funcional eu poderia utilizar os conceitos do paradigma de POO para deixar ainda mais estruturado e escalável.
 * Enfim, a arte de escrever códigos limpos.
 */

public class MatrizRefatorada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Informe a quantidade de alunos:");
        int qtd_alunos = sc.nextInt();
        System.out.println("Informe a quantidade de notas para cada aluno:");
        int qtd_notas = sc.nextInt();

        sc.nextLine();

        String[] nomesAluno = new String[qtd_alunos];
        double[][] notasAluno = new double[qtd_alunos][qtd_notas];

        //dica1: passar a instância do Scanner já como parâmetro, sem ter que instanciar novamente dentro dos métodos
        //dica2: não é necessário atribuir aos arrays o retorno desses métodos, posso retornar nada e mesmo assim
        //modificar o que está dentro de cada array, se tratando de passagens por referência
        preencherNomes(nomesAluno, sc);
        preencherMatriz(notasAluno, nomesAluno, sc);
        imprimirMatriz(notasAluno, nomesAluno);

        System.out.println(Arrays.deepToString(notasAluno)); //ao invés de toString, usa-se deepToString para arrays multidimensionais
        System.out.println(Arrays.toString(nomesAluno)); //obs: é possível usar o deepToString para qualquer dimensão (polimórfico)
        //System.out.println(Arrays.deepToString(nomesAluno)); -> polimórfico

        sc.close();
    }

    static void preencherNomes(String[] nomesAlunos, Scanner sc){
        System.out.println("\nInserindo os nomes dos alunos que irão receber as notas...");
        for (int i = 0; i < nomesAlunos.length; i++) {
            System.out.printf("Digite o nome do Aluno %d: ", i+1);
            nomesAlunos[i] = sc.nextLine();
        }
    }

    static void preencherMatriz(double[][] notasAluno, String[] nomesAluno, Scanner sc){
        System.out.println("\nPreenchendo as notas de cada aluno...");
        for (int i = 0; i < notasAluno.length ; i++) {
            System.out.printf("Insira agora as notas do aluno '%s'\n", nomesAluno[i]);

            for (int j = 0; j < notasAluno.length; j++) {
                System.out.printf("Nota %d: ", j+1);
                notasAluno[i][j] = sc.nextDouble();
            }
        }
    }

    static void imprimirMatriz(double[][] notasAluno, String[] nomesAluno){
        System.out.println("\nImprimindo as notas e a média final de cada aluno...");
        for (int i = 0; i < notasAluno.length; i++) {
            double media = 0;
            for (int j = 0; j < notasAluno[i].length; j++) {
                media += notasAluno[i][j];
            }
            System.out.printf("Aluno: %s | Notas: %s | Média: %.2f\n",nomesAluno[i], Arrays.toString(notasAluno[i]), media/nomesAluno.length);
        }
    }
}
