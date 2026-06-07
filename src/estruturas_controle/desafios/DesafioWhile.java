package estruturas_controle.desafios;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sair = "exit", nomeAluno;

        while (true){
            short i = 0; float media = 0;
            System.out.println("Digite o nome do Aluno: (para sair do programa digite 'exit')");
            nomeAluno = sc.nextLine();

            if (nomeAluno.equalsIgnoreCase(sair)) {
                System.out.println("Saindo do programa...");
                break;
            }

            while (i < 3){
                float nota;
                System.out.printf("Digite o valor da %dª nota: ", i+1);
                nota = sc.nextFloat();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida. Tente um valor de 0 a 10:");
                    continue;
                }

                media += nota;
                i++;
            }
            media /= i;
            System.out.printf("""  
                    
                    ////////////////////////////
                    * EXIBINDO MÉDIA DO ALUNO *
                    - NOME: %s
                    - MÉDIA FINAL: %.1f
                    ////////////////////////////
                    
                    """, nomeAluno, media);
            sc.nextLine(); //probleminha no buffer, de novo...
        }
        sc.close();

        /*Eu poderia criar uma função que para cada entrada com um nome, retornaria a média com base nela
        ou ainda, que faz mais sentido, criar uma classe Aluno. Onde para cada objeto do tipo Aluno, ele tem acesso
        ao méto.do calcularMedia() -> aluno1.calcularMedia() -> imprime ou só retorna o valor. Mas ainda não chegamos
        em POO...*/
    }
}
