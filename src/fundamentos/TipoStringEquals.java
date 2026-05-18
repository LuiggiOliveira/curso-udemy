package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        String s1 = new String("2"); //se eu fizesse String s = "2" iria dar true, mas agora dessa forma dá false
        System.out.println("2" == "2"); //aqui dá true, mas nem sempre isso funciona
        System.out.println("2" == s1); //false
        System.out.println("2".equals(s1));//true

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 2 para mostrar que realmente não é interessante usar == para comparar Strings: ");
        String s2 = sc.nextLine();
        System.out.println("2" == s2.trim());//o trim retira os espaços em brancos, exemplo "  2" -> "2"
        System.out.println("2".equals(s2.trim()));

        sc.close();
    }
}
