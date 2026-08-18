package poo.polimorfismo;

public class Pessoa {

    private double peso;

    public Pessoa(double peso) {
        setPeso(peso);
    }

    public void comer(Comida comida){ //é polimorfismo dinâmico, pois precisou criar uma superclasse que "unisse" as outras classes em um método só
        peso += comida.getPeso();
    }
    //além disso, como os outros métodos para cada classe fazem a mesma coisa, aqui eu reuso código, "generalizando" ele para qualquer classe que
    //herde da superclasse Comida

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) this.peso = peso;
    }
}
