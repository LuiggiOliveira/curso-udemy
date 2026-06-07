package classes_e_metodos;

public class DesafioPrimeiroTrauma { //foi bem fácil na realidade :)

    int a = 3; //NÃO POSSO MEXER NESSA ***LINHA***

    //todo RESPOSTA3: simplesmente criar outra variável (static) x de mesmo valor que a e imprimir na main
    static int b = 3;

    //todo RESPOSTA2: já que eu não posso mexer NESSA LINHA, então eu posso mexer aqui também.

    //com qualquer método que retorne ou imprima diretamente o valor dela, já que por padrão todo objeto vai vir com o valor 3 desse campo
    void imprimirValorDoCampoA() {
        System.out.println(this.a);
    }

    int retornarValorDoCampoA(){
        return this.a;
    }

    public static void main(String[] args) {
        //todo DESAFIO: Corrigir esse problema. O que é necessário fazer para que seja possível imprimir o valor de A?

        //todo RESPOSTA1: Como a é um campo/atributo dentro dessa classe, bastaria instanciar ela e acessar esse atributo com notação ponto
        DesafioPrimeiroTrauma x = new DesafioPrimeiroTrauma();
        //fazer isso aqui funcionar -> System.out.println(a)
        System.out.println(x.a); //resposta 1

        x.imprimirValorDoCampoA(); //resposta 2.1
        System.out.println(x.retornarValorDoCampoA()); //resposta 2.2
        //ou poderia também criar outros dois métodos statics com as mesmas instruções

        System.out.println(b); //resposta 3
    }
}
