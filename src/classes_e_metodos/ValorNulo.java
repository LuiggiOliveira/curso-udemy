package classes_e_metodos;

import classes_e_metodos.desafio_data.Data;

public class ValorNulo {
    public static void main(String[] args) {
        String s1 = "";
        System.out.println(s1.concat("!!!"));

        Data d1 = Math.random() > 0.5 ? new Data() : null; //Math.random() -> {x ∈ R | 0.0 >= x < 1.0} ou [0,1)
        //d1.mes = 1; -> NullPointerException (mesmo "mes" recebendo por padrão 0, ainda sim não há um endereço associado)
        if (d1 != null){
            d1.mes = 1;
            System.out.println(d1.obterDataFormatada());
        }

        String s2 = Math.random() > 0.5 ? "Boa noite" : null;
        //System.out.println(s2.concat("!!!")); -> Exception in thread "main" java.lang.NullPointerException (...)
        //ou seja, diz que você está tentando acessar algum atributo de uma variável nula
        if (s2 != null){
            System.out.println(s2.concat("!!!"));
        }

    }
}
