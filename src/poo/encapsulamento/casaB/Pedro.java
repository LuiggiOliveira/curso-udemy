package poo.encapsulamento.casaB;

import poo.encapsulamento.casaA.Ana;

public class Pedro extends Ana { //Pedro é filho de Ana ou tem alguma outra relação familiar com ela
//    Ana mae = new Ana();

    void testeAcessos() {
        System.out.println(nome); //aqui também não é necessário acessar por meio da instância "mae" já que herdou da classe, ou seja, de Ana
        System.out.println(new Ana().nome); // mae.nome ou assim que nem eu fiz são outras formas de se acessar
        System.out.println(super.segredoFamiliar); // eu não consigo acessar por meio de mae.segredoFamiliar, pois HERDA DA CLASSE e não DO OBJETO dessa classe
        System.out.println(segredoFamiliar); // até pensei se poderia acessar assim também... E realmente pode
//      System.out.println(mae.rotina); (pacotes/casas diferentes)
//      System.out.println(mae.segredoPessoal); (único que dá errado, porque somente ela sabe do seu próprio segredo)
    }

    public static void main(String[] args) {
        Pedro pedro = new Pedro();

        pedro.testeAcessos();
    }
}
