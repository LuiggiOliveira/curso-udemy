package arraysCollections.arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        double mediaA = 0;
        double lengthA = notasAlunoA.length;

        double[] notasAlunoB    = {8.5, 7.6, 9.0, 10.0, 9.4};
        double mediaB = 0;
        double lengthB = notasAlunoA.length;

        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 6.7;
        notasAlunoA[1] = 7.8;
        notasAlunoA[2] = 9.5;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(Arrays.toString(notasAlunoB));

//        O famoso "for-each" ou "for otimizado" que lembra um pouco do for do python que mistura os dois
//        for i in range(notasAlunoA.len()):                for i in notasAlunoA:
//          print(notasAlunoA[i]                                print(i)
        for (double v : notasAlunoA) {
            mediaA += v;
        }

        for (int i = 0; i < lengthB; i++) {
            mediaB += notasAlunoB[i];
        }

        mediaA /= lengthA;
        mediaB /= lengthB;

        System.out.printf("Média de notas do aluno A: %.2f\n", mediaA);
        System.out.printf("Média de notas do aluno B: %.2f\n", mediaB);

        //CTRL + SHIFT + ARROW (pega a linha toda e muda ela pra cima ou para baixo)
        //CTRL + ENTER (espaço para cima)
    }
}
