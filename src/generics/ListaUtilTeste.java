package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

    public static void main(String[] args) {

        List<String> langs = Arrays.asList("JS","PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        String ultimaLinguagem = (String) ListaUtil.getUltimoElemento1(langs);
        System.out.println(ultimaLinguagem);

        Integer ultimoNumero = (Integer) ListaUtil.getUltimoElemento1(nums); //tanto faz usar int ou Integer aqui
        System.out.println(ultimoNumero);

        String ultimaLinguagem2 = ListaUtil.getUltimoElemento2(langs);
        System.out.println(ultimaLinguagem2);

        // especificando o tipo dessa forma, garanto que o parâmetro seja Integer
        Integer ultimoNumero2 = ListaUtil.<Integer>getUltimoElemento2(nums);
        System.out.println(ultimoNumero2);

    }
}
