package poo.encapsulamento.casaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcessos() {
        System.out.println(esposa.nome);
        System.out.println(esposa.segredoFamiliar); // detalhe que mesmo não possui relação de herança, por estar no mesmo pacote, ainda é possível acessar
        System.out.println(esposa.rotina);
//        System.out.println(esposa.segredoPessoal); (único que dá errado, porque somente ela sabe do seu próprio segredo)
    }

    public static void main(String[] args) {
        Paulo paulo = new Paulo();

        paulo.testeAcessos();
    }
}
