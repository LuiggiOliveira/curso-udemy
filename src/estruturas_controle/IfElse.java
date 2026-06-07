package estruturas_controle;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a média: ");
        double media = sc.nextDouble();

        boolean aprovado = media >= 7 && media <= 10;
        boolean recuperacao = media < 7 && media >= 5;
        boolean reprovado = media < 5;

        if (media < 0 || media > 10){
            System.out.println("ERRO: A média não pode passar do intervalo de 0 a 10.");
        } else { //obs: quando colocar else, ele tem que vir imediatamente depois do if, não posso criar uma variável entre eles, por exemplo
            if (aprovado) System.out.println("Aprovado.");
            if (recuperacao) System.out.println("Recuperação.");
            if (reprovado) System.out.println("Reprovado."); //até esqueço que isso é possível com apenas 1 instrução
        }
        sc.close();
    }
}
