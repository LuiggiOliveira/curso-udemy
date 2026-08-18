package poo.heranca.desafio_encapsulamento;

import poo.heranca.desafio.Carro;
import poo.heranca.desafio.Esportivo; //como uma interface ainda é uma classe Java, se fosse declarar seu tipo, deveria importar por estar em packages diferentes
import poo.heranca.desafio.Ferrari;
import poo.heranca.desafio.Fusca;

// todo MUDEI PARA ESSA PASTA POR CONTA DO DESAFIO DE ENCAPSULAMENTO, PRECISANDO APLICAR OS MODIFICADORES DE ACESSO E FAZER
//  ESSE CÓDIGO VOLTAR A FUNCIONAR
public class CarroTeste {
    public static void main(String[] args) {
        //eu poderia aplicar conceitos de cinemática e dizer que o carro começou pela esquerda (quando fosse negativo a velocidade)
        Ferrari ferrari = new Ferrari(312); //também, poderia colocar Carro ferrari = new Ferrari() que daria certo aqui nesse caso
        Carro fuscaoPreto = new Fusca();

        System.out.println("Andando de Ferrari:");
        ferrari.frear();
        ferrari.acelerar(); //turbo e ar desligado -> 20
        ferrari.ligarAr();
        ferrari.acelerar(); //turbo desligado e ar ligado -> 15
        ferrari.ligarTurbo();
        ferrari.acelerar(); //turbo e ar ligado -> 30
        ferrari.desligarAr();
        ferrari.acelerar(); //turbo ligado e ar desligado -> 35
        ferrari.frear();


        System.out.println("\nMudando para o Fuscão Preto:");
        fuscaoPreto.acelerar();
        fuscaoPreto.acelerar();
        fuscaoPreto.frear();

        System.out.println("Velocidade do ar da ferrari: " + ferrari.velocidadeDoAr()); // a interface define sempre como 1 por padrão

        /* Observações ao implementar a interface Esportivo:
        Eu tive que trocar o tipo Carro para Ferrari, já que apenas Ferrari implementa a interface Esportivo. Ou eu
        poderia colocar como "Esportivo ferrari = new Ferrari()" da mesma forma que "List lista = new ArrayList<>()" ao
        invés de "ArrayList<> lista = new ArrayList<>()". Porém, com isso essa ferrari perderia os métodos e atributos
        dentro da superclasse Carro. Além disso, se eu quisesse continuar com o tipo Carro, para usar o turbo eu deveria
        implementar essa interface em Carro, dessa forma a classe Fusca também poderia usar o turbo.

        Portanto, nesses casos o ideal é chamar a classe Ferarri mesmo, já que ela herda de Carro e, ao mesmo tempo, implementa
        a interface Esportivo, caso eu não queira implementar essa interface na superclasse.
        */
    }
}
