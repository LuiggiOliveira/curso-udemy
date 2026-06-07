package arraysCollections.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetOrganizado {
    public static void main(String[] args) {
//        é dentro do operador diamond <> que eu coloco o tipo desse conjunto (tem que ser Wrapper caso seja primitivo)
//        HashSet<String> lista = new HashSet<>(); (NÃO ORDENADO)
        SortedSet<String> lista = new TreeSet<>(); //ORDENADO, pois usamos o TreeSet ao invés de HashSet e o SortedSet (ou só Set ou ainda TreeSet
//        Esse tipo de notação usando <> é chamado de "Generics"
        lista.add("Teste123"); //mostra "String e" dentro dos parênteses vazios
        lista.add("Ana");
        lista.add("Luciana");
        lista.add("João");
        lista.add("Pedro");
        System.out.println(lista);

        for (String i : lista){
            System.out.println(i);
        }

        SortedSet<Double> notas = new TreeSet<>();
        notas.add(6.7);
        notas.add(10.0);
        notas.add(8.75);
        notas.add(9.0); //sempre botar por ex: '9.0' e não só '9'

        for (double d : notas){ //autobox -> converte o primitivo automaticamente para seu respectivo Wrapper
            System.out.println(d);
        }
    }
}
