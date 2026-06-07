package estruturas_controle;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String linguagemProgramacao = "JAVA";

        switch (linguagemProgramacao){
            case "JAVASCRIPT":
                System.out.println("Front-end");
            case "PYTHON":
                System.out.println("Ciência de Dados ou IA");
            case "JAVA":
                System.out.println("Back-end");
            default: //aqui vai executar mesmo caindo em algum dos cases, pois não há break após executar, pulando para o próximo até default
                System.out.println("Sei lá, vai para redes, infra...");
        }

        System.out.println("Fim do primeiro Switch (sem break)");

        int opcao = 2;
        switch (opcao){
            case 0:
                System.out.println("opção 1"); break;
            case 1:
                System.out.println("opção 2"); break;
            case 2:
                System.out.println("Opção 3"); break;
            default:
                System.out.println("Nenhuma anterior"); break;
        }
        System.out.println("Fim do segundo switch (com break)");

        String conceito = "";
        System.out.println("Informe a nota: ");
        int nota = sc.nextInt();

        switch (nota){
            case 10: case 9:
                conceito = "A"; break;
            case 8: case 7:
                conceito = "B"; break;
            case 6: case 5:
                conceito = "C"; break;
            case 4: case 3:
                conceito = "D"; break;
            case 2: case 1: case 0:
                conceito = "E"; break;
            default: //obs: eu posso mover default para qualquer lugar (caso esteja no último lugar, não é necessário o break)
                System.out.println("Não informado!");
        }

        System.out.println("Conceito é " + conceito + " (múltiplos cases)");
        sc.close();
    }
}
