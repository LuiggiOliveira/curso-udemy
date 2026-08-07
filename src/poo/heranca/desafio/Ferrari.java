package poo.heranca.desafio;

public class Ferrari extends Carro {

//    obs: se eu não definir esse construtor, por padrão iria chamar o construtor da superclasse mesmo com "new Ferrari()"
    Ferrari(){
        this.velocidadeMaxima = 220;
        this.aceleracao = 15;
    }

// obs2: eu poderia sobrescrever os métodos colocando por exemplo "void acelerar(){ velocidadeAtual += 15; }", porém
// acho que do modo que fiz ficou melhor do que no exemplo da aula.
}
