package classes_e_metodos.desafio_modulo;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double pesoEmKg){
        this.nome = nome;
        this.peso = pesoEmKg;
    }

    void comer(Comida c, int qtd_porcoes){
        this.peso += (c.peso * qtd_porcoes) / 1000; //esqueci de converter gramas para kg!!!!
    }

    void imprimirDetalhes(){
        System.out.printf("""
                Nome: %s
                Peso atual: %.3f Kg
                
                """, nome, peso);
    }
}
