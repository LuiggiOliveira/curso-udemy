package poo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Luiggi", "Oliveira", -54);
        p1.setIdade(22);

        System.out.println(p1.getClass()); //nativo do java
        System.out.println(p1.getIdade());
        System.out.println(p1.getNome());
        System.out.println(p1.getNomeCompleto());
        System.out.println(p1);
        //como sobrescrevi o toString, ao invés de retornar o valor hexadecimal do hash do objeto, aparece a mensagem que eu coloquei pra retornar
    }
}
