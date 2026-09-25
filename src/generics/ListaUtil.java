package generics;

import java.util.List;

public class ListaUtil {

    private ListaUtil() {

    }

    public static Object getUltimoElemento1(List<?> lista) {
        return lista.get(lista.size() - 1);
    }

    // definindo o tipo T (quando uso <T>) eu não preciso mais ficar fazendo casting da mesma forma que
    // no exemplo da Caixa<T> com variáveis e métodos do tipo T
    public static <T> T getUltimoElemento2(List<T> lista) {
        return lista.get(lista.size() - 1);
    }

    public static <A, B, C> C teste(A paramA, B paramB) {
        C teste = null;
        return teste;
    }

    // <?> significa que pode ser qualquer coisa (diferente de <Object>, já que assim esperaria uma lista de somente de Object)
    // <?> flexibilidade na leitura de hierarquias desconhecidas no momento de compilação (Wildcard)
    // <Object> quando é um tipo genérico simples e seguro
    // <? extends Object> é uma possibilidade também
}
