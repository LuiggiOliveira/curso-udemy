package classes_e_metodos;

import classes_e_metodos.desafio_data.Data;

public class ValorVsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a; //atribuição por valor (tipo primitivo)
        a++;
        b--;
        System.out.println(a + " " + b);

        Data d1 = new Data(29, 5, 2026);
        Data d2 = d1; //atribuição por referência (objeto)

        d1.dia = 31;
        d2.mes = 12;
        d1.ano = 2022; //se um mexe em um campo altera para todos que apontam para o mesmo objeto em memória
        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarParaDataPadrao(d2);
        d1.imprimirData();
        d2.imprimirData();

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }
    // somente um método static pode ter acesso a outro método static
    static void voltarParaDataPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int c){ //não gera impacto já que passei um valor e não uma referência (ponteiro)
        c++;
    }
}
