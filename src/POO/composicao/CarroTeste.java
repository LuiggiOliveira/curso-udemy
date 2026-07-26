package POO.composicao;

public class CarroTeste {

    public static void main(String[] args) {

        Carro c1 = new Carro(); //tentar fazer isso funcionar agr
        System.out.println(c1.estaLigado());
        c1.ligar();
        System.out.println(c1.estaLigado());

        System.out.println(c1.getGiros());
        System.out.println(c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.getGiros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        System.out.println(c1.getGiros());

        // Sem encapsulamento, é possível que o usuário modifique c1.motor.fatorInjecao = -30;

        //não freia
        c1.frear();
        System.out.println(c1.getGiros());

        // Só é possível fazer isso porque agora é biderecional
        System.out.println(c1.motor.carro.motor.carro.motor.giros());
    }
}
