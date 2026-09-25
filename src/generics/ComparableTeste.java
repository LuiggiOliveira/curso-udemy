package generics;

import java.util.TreeSet;

public class ComparableTeste {

    public static void main(String[] args) {

        // Integer, por exemplo, na sua implementação ele utiliza o Comparable do tipo Integer
        TreeSet<Integer> nums = new TreeSet<>();

        nums.add(10);
        nums.add(7);
        nums.add(3);
        nums.add(0);
        nums.add(-32);
        nums.add(321);
        nums.add(6);
        nums.add(101);

        // imprime usando o Comparable implementando dentro de Integer (usando o compareTo() )
        // menor = -1, igual = 0, maior = +1
        nums.forEach(System.out::println);
        // e não foi utilizado o TreeSet porque utilizava tipos genéricos, o que dificulta bastante implementar Comparable
    }
}
