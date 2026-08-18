package poo.heranca.desafio;

public class Fusca extends Carro {

    public Fusca (){
        this(135);
    }

    public Fusca (int velocidadeMaxima){
        super(velocidadeMaxima);
        this.setAceleracao(6);
    }

//    @Override
//    boolean acelerar() {
//        return super.acelerar();
//    }

    //obs interessante: quando tenho um método public, por exemplo, e tento sobrescrever ele com protected o java não permite.
    // Isso se dá porque não é permitido aumentar a restrição quando o método que vai ser sobrescrito tem um nível menor de restrição.
    // Outro exemplo é se eu for sobrescrever o método clone() (que é protected) e passar ele agora como public, aí sim é permitido.
}
