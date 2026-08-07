package poo.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {
        //eu poderia aplicar conceitos de cinemática e dizer que o carro começou pela esquerda (quando fosse negativo a velocidade)
        Ferrari ferrari = new Ferrari(); //também, poderia colocar Carro ferrari = new Ferrari() que daria certo aqui nesse caso
        Carro fuscaoPreto = new Fusca();

        System.out.println("Andando de Ferrari:");
        ferrari.frear();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.frear();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar(); // atinge a velocidade limite
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.frear();

        System.out.println("\nMudando para o Fuscão Preto:");
        fuscaoPreto.acelerar();
        fuscaoPreto.acelerar();
        fuscaoPreto.acelerar();
        fuscaoPreto.acelerar();
        fuscaoPreto.acelerar();
        fuscaoPreto.acelerar();
        fuscaoPreto.acelerar();
        fuscaoPreto.acelerar();
        fuscaoPreto.acelerar();
        fuscaoPreto.acelerar();
        fuscaoPreto.acelerar();
        fuscaoPreto.acelerar();
        fuscaoPreto.frear();
    }
}
