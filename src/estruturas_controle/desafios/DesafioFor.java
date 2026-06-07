package estruturas_controle.desafios;

public class DesafioFor {
    public static void main(String[] args) {
        /*Fazer uma escadinha com #, porém não pode usar valores númericos dentro dos parâmetros do for
        o que eu pensei: "então é só imprimir, concatenar, imprimir e assim sucessivamente até o fim" */

        for (String i = "#"; !i.equals("#####"); i += "#"){
            System.out.println(i);
        }

        System.out.println("\53"); //ignore, só testando
    }
}
