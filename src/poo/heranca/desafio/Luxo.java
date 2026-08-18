package poo.heranca.desafio;

public interface Luxo {

    //  tudo é public
    //  está implícito que todos os métodos aqui são abstratos
    //  além de que todos os atributos são constantes

    void ligarAr();
    void desligarAr();

    default int velocidadeDoAr(){ // transforma em um método opcional
        return 1;
    }

}
