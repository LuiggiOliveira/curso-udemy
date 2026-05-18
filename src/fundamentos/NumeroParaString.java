package fundamentos;

public class NumeroParaString {
    public static void main(String[] args) {
        // Usando wrapper
        Integer num1 = 10000;
        int num2 = 1234;
        String str1 = num1.toString(); // Se não fosse um wrapper, não seria possível usar métodos assim em um primitivo
        int digitos = str1.length();
        System.out.println(str1 + " provando que é uma string agora. Dígitos: " + digitos);
        System.out.println(Integer.toString(num2) + " num2 é uma String agora!");
        System.out.println(("" + num2).length() + " Usando um jeito não muito elegante, mas que o java entende");
    }
}
