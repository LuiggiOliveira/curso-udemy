package POO.composicao;

public class Carro {

    // Motor motor = new Motor(); antes assim era unidirecional, pois só Carro enxergava Motor e não Motor enxergava Carro
    final Motor motor;

    Carro() {
        this.motor = new Motor(this); // Agora ambas classes se enxergam, ou seja, relação bidirecional
    }

    void acelerar(){
        if (estaLigado()){
            if (motor.fatorInjecao < 2.5){
                motor.fatorInjecao += 0.4;
            }
        }
    }

    void frear(){
        if (estaLigado()){
            if (motor.fatorInjecao > 0.5){
                motor.fatorInjecao -= 0.4;
            }
        }
    }

    void ligar(){
        motor.ligado = true;
    }

    void desligar(){
        motor.ligado = false;
    }

    boolean estaLigado(){
        return motor.ligado;
    }

    int getGiros(){
        return motor.giros();
    }

    public void fer() {
    }
}
