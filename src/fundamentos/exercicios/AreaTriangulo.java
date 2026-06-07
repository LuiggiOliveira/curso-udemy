package fundamentos.exercicios;

/* Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.  */

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da altura:");
        double altura = sc.nextDouble();
        System.out.println("Digite o valor da base");
        double base = sc.nextDouble();
        double areaTriangulo = altura*base/2;
        System.out.printf("A área do triângulo de altura %.2f e base %.2f é %.2f", altura, base, areaTriangulo);
    }
}
