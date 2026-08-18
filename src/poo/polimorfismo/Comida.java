package poo.polimorfismo;

public abstract class Comida { // public abstract class Comida... mas ainda não chegamos em classes abstratas

    private double peso;

    public Comida(double peso) {
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) this.peso = peso;
    }
}
