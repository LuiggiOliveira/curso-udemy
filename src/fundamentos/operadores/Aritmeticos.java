package fundamentos.operadores;

public class Aritmeticos {
    public static void main(String[] args) {
        System.out.println(2+3);
        var x = 34.56;
        double y = 2.2;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);

        int a = 8;
        int b = 5;
        System.out.println(a/b);
        System.out.println(a/ (double) b); //precedência -> 1° casting de b para double  -> 2° divisão a/b
        System.out.println(1+10*2-40%6/2); //10*2=20; 40%6=4; 4/2=2; 1+20-2=19


    }
}
