package fundamentos.exercicios;
import javax.swing.*;

/*
Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
*/

//eu poderia criar uma classe pra cada programa, mas vou juntar os dois em um, porque eu to com preguiça
public class ConversorDeTemperatura {
    public static void main(String[] args) {
        // C/5 = (F-32)/9 saudades das aulas de física
        double temperatura_convertida = 0;
        //poderia usar Scanner, mas gostei do JOptionPane
        String celsius = JOptionPane.showInputDialog("Digite a temperatura em Celsius (°C)"); //botar '.' e não ','
        double c = Double.parseDouble(celsius);
        temperatura_convertida = 9*c/5+32;

        System.out.printf("%s °C -> %.2f °F\n", celsius, temperatura_convertida);

        String fahreinheit = JOptionPane.showInputDialog("Digite a temperatura em Fahreinheit (°F)");
        double f = Double.parseDouble(fahreinheit);
        temperatura_convertida = 5*(f-32)/9;

        System.out.printf("%s °F -> %.2f °C", fahreinheit, temperatura_convertida);
    }
}
