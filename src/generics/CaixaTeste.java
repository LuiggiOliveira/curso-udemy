package generics;

public class CaixaTeste {

    public static void main(String[] args) {

        // Da mesma forma que eu fiz lá em Collections!
        Caixa<String> caixaA = new Caixa<>(); //Substitui Caixa<TIPO> por Caixa<String> e tudo aquilo que estava definido como TIPO/T
        caixaA.guardar("Segredo");

        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(2.0);

        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);
    }
}
