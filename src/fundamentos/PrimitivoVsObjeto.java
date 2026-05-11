package fundamentos;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {
        //testando um negócio
        String s = "teste"; //é um objeto da classe String
        s = s.toUpperCase();
        System.out.println(s);

        // Wrappers são tudo aqui que não são objetos, ou seja, no caso é tudo aquilo que é primitivo -> variáveis primitivas
        int a = 123; // 'a' não é um objeto, mas sim um wrapper já que é do tipo primitivo
        System.out.println(a);

    }
}
