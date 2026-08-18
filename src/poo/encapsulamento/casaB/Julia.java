package poo.encapsulamento.casaB;

import poo.encapsulamento.casaA.Ana;

public class Julia {
    Ana sogra = new Ana();

    void testeAcessos() {
        System.out.println(sogra.nome);
//      System.out.println(sogra.segredoFamiliar);
//      System.out.println(sogra.rotina);
//      System.out.println(sogra.segredoPessoal); (único que dá errado, porque somente ela sabe do seu próprio segredo)
    }

    public static void main(String[] args) {
        Julia julia = new Julia();

        julia.testeAcessos();
    }
}
