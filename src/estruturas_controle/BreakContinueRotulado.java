package estruturas_controle;

public class BreakContinueRotulado {
    public static void main(String[] args) {

        //colocando um rótulo para o loop mais externo
        externo:
        for (int i = 0; i < 3; i++){
            interno: for (int j = 0; j < 3; j++){
                if (i == 1) break externo;
                System.out.printf("%d %d |", i, j);
                /* quando coloco apenas break, quebra o loop mais interno. quando coloco rótulo, ou seja, break externo
                quebra a partir do loop rotulado como "externo" */
            }
            System.out.println();
        }
        System.out.println("Fim. (BREAK ROTULADO)");

        // Agora com continue rotulado é a mesma coisa que o break rotulado
        externo:
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (i == 1) continue externo;
                System.out.printf("%d %d |", i, j);
            }
            System.out.println();
        }
        System.out.println("Fim. (CONTINUE ROTULADO)");

        /* Tentar evitar usar break e continue, já que normalmente quando se usa muito, é porque o código está complexo de ser lido
        Porém, pode ser que em algum caso específico seja necessário. Neste exemplo, temos o break rotulado.
        É só para saber que existe, mas mesmo assim evite. */
    }
}
