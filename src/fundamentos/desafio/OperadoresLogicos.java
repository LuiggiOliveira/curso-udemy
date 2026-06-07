package fundamentos.desafio;

public class OperadoresLogicos {
    public static void main(String[] args) {
        /*
        1. TENHOS DOIS TRABALHOS: quinta e sexta
        2. SE OS DOIS DEREM CERTO: comprar tv de 50 polegadas
        3. SE APENAS UM DOS DOIS DEREM CERTO: compra tv de 32 polegadas
        4. OU COMPRANDO UMA TV DE 50 OU TV DE 32: tomar sorvete
        5. SE NENHUM TRABALHO DER CERTO: ficar em casa
        6. SE TOMAR SORVETE: menos saudável
         */

        // é só mudar o valor para verificar o resultado de cada caso
        boolean trabalho1 = false; //terca
        boolean trabalho2 = false; //quinta

        boolean compraTv50 = trabalho1 && trabalho2; // no intellij é: seleciona nome -> shift + f6 (não esqueceer do fn + esc)
        boolean compraTv32 = trabalho1 ^ trabalho2;
        boolean tomar_sorvete = compraTv50 || compraTv32;
        boolean maisSaudavel = !tomar_sorvete; //unário, enquanto os outros são binários
        boolean ficar_em_casa = !trabalho1 && !trabalho2;

        System.out.println("Compraram TV de 50 polegadas? " + compraTv50);
        System.out.println("Compraram TV de 32 polegadas? " + compraTv32);
        System.out.println("Tomaram sorvete? " + tomar_sorvete);
        System.out.println("Ficaram mais saudáveis? " + maisSaudavel);
        System.out.println("Ficaram em casa? " + ficar_em_casa);

        // Verificando equivalência -> !A && !B == !(A && B)
        // A | B | !A && !B   |  !(A && B)
        // 1 | 1 | 0 && 0 = 0 | !(1) = 0 -> NÃO SÃO EQUIVALENTES
        // 1 | 0 | 0 && 1 = 0 | !(0) = 1
        // 0 | 1 | 1 && 0 = 0 | !(0) = 1
        // 0 | 0 | 1 && 1 = 1 | !(0) = 1
        //PORÉM !(A && B) = !A || !B (LEI DE MORGAN)
    }
}
