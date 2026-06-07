package estruturas_controle;

public class For {
    public static void main(String[] args) {
        for (int contador = 0; contador < 10; contador++){
            System.out.println("i = " + contador);
        }

        //EQUIVALENTE AO WHILE determinado
        int contador = 0;
        while (contador < 10){
            System.out.println("i = " + contador);
            contador++;
        }

        //for (;;){ System.out.println("Infinito (teoricamente, na prática obviamente não)"); }
    }
}
