package lambdas;

public class CalculoTeste2 {

    public static void main(String[] args) {

        Calculo calculo = (x, y) -> { return x + y; };
//      Calculo somar = Double::sum; | Double.sum() -> Double::sum
        System.out.println(calculo.executar(2, 3));

//      calculo = (x, y) -> { return x * y; }; E OUTRO DETALHE QUE QUANDO SE TEM APENAS UM PARÂMETRO, PODE USAR SEM PARÊNTESES
        calculo = (x, y) -> x * y; // não precisa de chaves aqui, pois o java entende que essa sentença de código retorna implicitamente
        System.out.println(calculo.executar(2, 3));

        System.out.println(calculo.resultado(2, 3));
        System.out.println(Calculo.mensagem());
    }
}
