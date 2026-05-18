package fundamentos.desafio;

public class OperadoresAritm {
    public static void main(String[] args) {
        int a = 9*4+2*32;
        //Math.pow sempre retorna um double, caso eu quisesse, eu poderia utilizar cast com (int)
        int b = (int) Math.pow(a, 0.5); //ou eu posso nesse caso, obviamente, só fazer a*a*a
        //além de que é possível também fazer uma radiciação, já que matematicamente, por exemplo: sqrt(a²) = Math.pow(a, 0.5) = a
        System.out.printf("a = %d | b = %d\n", a, b);

        // Agora a parte do desafio
        double z = (6 * (3 + 2)); //30
        double y = Math.pow(z, 2)/(3*2); //30²/6= 900/6 = 150 (tomar cuidado com o denominador senão divide por 3 e depois multiplica por 2)
        double x = (double) (1-5)*(2-7)/2; //(-4)*(-5)/2 = 20/2 = 10
        double w = Math.pow(x,2); //100
        double v = y - w; //150-100 = 50
        double u = Math.pow(v,3); //50³ = 50*50*50 = 2500*50 = 125000
        double t = u/Math.pow(10,3); //125k / 1k = 125 (cancela os k's, já que k é 1000)
        System.out.println("O resultado dessa expressão algébrica é: " + t);
    }
}
