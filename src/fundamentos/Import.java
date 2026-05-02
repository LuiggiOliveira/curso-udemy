package fundamentos;

import java.util.Date;

public class Import {
    public static void main(String[] args) {
        //dica: no SQL também tem como usar métodos, um deles são os relacionados à data, oferecendo mais desempenho
        //porque nele roda em um nível mais baixo do que se eu fosse usar na aplicação.

        java.lang.String x = "Boa noite!";

        Date d = new Date();
        System.out.println(d); //vai printar a data atual e o horário
        //ou java.util.Date d2 = new Date(); -> sem o import





    }
}
