package generics;

public class CaixaNumeroTeste {

    public static void main(String[] args) {

        // Se eu fizer CaixaNumero<String> não será permitido, pois String não herda de Number
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(2.5);
        System.out.println(caixaA.abrir());

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        caixaB.guardar(2);
        System.out.println(caixaB.abrir());
    }
}
