package desafios_proprios;

import java.util.Scanner;

/*
 * Crie uma função que aceite uma data em qualquer um dos formatos mencionados e retorne a data no formato padrão
 * "YYYY-MM-DD". Caso a data seja inválida, a função deve retornar uma mensagem de erro informando que a data não é
 * válida. (Obs: desafio que encontrei aleatoriamente no youtube e resolvi tentar)
 *
 * -> ASSUME-SE QUE SEMPRE O MÊS VAI FICAR NO MEIO ENTRE ANO E DIA OU DIA E ANO, já que eu pelo menos acredito que
 * isso seria impossível ou ao menos muito mais complicado para diferenciar o que é dia e o que mês
 *
 * exemplos:
 * ENTRADA: "13/03/2025" SAÍDA: "2025-03-13"
 * ENTRADA: "2025/03/13" SAÍDA: "2025-03-13"
 * ENTRADA: "2025\03\13" SAIDÁ: "2025-03-13"
 * ENTRADA: "13-03-2025" SAÍDA: "2025-03-13"
 * ENTRADA: "2025-03-13" SAÍDA: "2025-03-13"
 * ENTRADA: "13/03/2025" SAÍDA: "2025-03-13"
 * ENTRADA: "13 DE MARÇO DE 2025" SAÍDA: "2025-03-13"
 */

public class NormalizandoDatas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma data em qualquer formato: ");
        String data = sc.nextLine();

        String dataNormalizada = NormalizandoDatas.normalizar(data);

        System.out.println(dataNormalizada);

        sc.close();
    }

    static String normalizar(String data) {
        String ano = "", mes = "", dia = "";

        if (data.length() == 10) { // Se for o caso com apenas números e divisões (ex: 2025/03/12, 03-12-2026)
            //TODO se entrar aqui ele vai verificar se têm '/', '-', '\'

            //TODO preciso que divida a String de modo que gere um array de tamanho 3 com cada um representando dia, mes e ano
            // mantendo sempre o mes no índice 1 (no meio)

            //TODO verificar se dia, mês e ano são números
            //TODO verificar por tamanho da String se é ano ou dia e aí armazenar cada número em uma variável

            //TODO retornar para o formato normalizado "YYYY-MM-DD"
            return ano + "-" + mes + "-" + dia;
        }
        // "1 maio 2000" -> 11 chars no mínimo :: "10 de fevereiro de 2000" -> 23 chars no máximo (pelo que eu estimei)
        // até porque o "espaço" e o "de"/"DE"/"De"/"dE" vão ser removidos no fim e o mês será convertido para o número correspondente
        else if (!data.isBlank() && data.length() >= 11 && data.length() <= 23) { // Caso seja algo como: "4 de maio de 2022"
            //TODO se entrar aqui ele espera que não vai ter "/', '-', '\'

            //TODO verificar se todos são números
            //TODO no caso do MÊS, se for palavra e for igual a algum mês: MARÇO/março/Março -> 03 (atenção com o zero)
            //TODO remover " de " e colocar o dia, mês e ano em suas respectivas variáveis
            return ano + "-" + mes + "-" + dia;
        }

        return "Formato inválido!";
    }
    //TODO criar método que verifica se é um número (sempre espero primeiro um número e no final um número
    //TODO criar método que transforma mês em um número: "FEVEREIRO" -> "02"

}
