package fundamentos;

public class Wrapper { // o "OOP" dos Primitivos
    public static void main(String[] args) {

        // Para cada Primitivo existe um Wrapper

        Byte b = 100;
        Short s = 1000;
        //Integer i = Integer.parseInt(sc.next()); -> next() lê apenas a palavra, parando ao encontra espaço em branco, já o nextLine() vai até '\n'
        Integer i = 10000; // int
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString() + " provando que é uma String");
        System.out.println(i * 123);
        System.out.println(l / 3);

        Float f = 123.4F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        if (bo) System.out.println("provando que agora bo é boolean"); //SIM, É POSSÍVEL IF SEM CHAVES!! (mas só com uma instrução)
        System.out.println(bo.toString().toUpperCase() + " provando que agora bo é uma String");

        Character c = 's';
        System.out.println(c + " teste " + 'p');
        // ctrl + alt + L -> formata o código


    }
}
