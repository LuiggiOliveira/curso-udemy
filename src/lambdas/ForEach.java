package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays
                .asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional...");
        for(String nome : aprovados){
            System.out.println(nome);
        }

        System.out.println("\nLambda #01..."); // + de 1 parâmetro -> () | se for apenas 1 -> opcional uso de () E uso de {}
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));

        System.out.println("\nMethod Reference #01...");
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda #02... (com saída personalizada)");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod Reference #02... (com saída personalizada)");
        aprovados.forEach(ForEach::meuImprimir); // sempre eu passo: classe::metodo (o método deve receber parâmetro)
    }

    static void meuImprimir(String nome){
        System.out.println("Meu nome é " + nome);
    }
}
