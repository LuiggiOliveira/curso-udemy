package fundamentos.exercicios;

/*
Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
 */

//Bhaskara? Eu chamo de Equação do Segundo Grau!
public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        double a = 2;
        double b = 4;
        double c = -6;
        double delta = b*b-4*a*c;
        double x1 = (-b + Math.sqrt(delta))/(2*a); //eu tinha esquecido do '*' e fiquei alguns minutos tentando entender o erro de sintaxe...
        double x2 = (-b - Math.sqrt(delta))/(2*a);

        System.out.printf("a = %.2f, b = %.2f, c = %.2f\n", a, b, c);
        System.out.printf("X1 = %.2f\nX2 = %.2f", x1, x2);
    }
}
