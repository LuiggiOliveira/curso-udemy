package arraysCollections.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class    Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        // "put" e não "add" porque conceitualmente "put" vai inserir se estiver vazio e sobrescrever se existir
        usuarios.put(1, "Roberto"); // adiciona
        usuarios.put(1, "Ricardo"); // substitui
        usuarios.put(2, "Rafaela");
        usuarios.put(3, "Roberta");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet()); //imprime chaves em ordem de inserção
        System.out.println(usuarios.values()); //imprime valores em ordem de inserção
        System.out.println(usuarios.entrySet()); //imprime chaves e os seus respectivos valores em ordem de inserção

        System.out.println(usuarios.containsKey(3));
        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Rebeca"));
        System.out.println(usuarios.get(4));
        System.out.println(usuarios.remove(3));
        System.out.println(usuarios.remove(3, "André")); // como a chave 3 está vazia, qualquer tentativa vai dar "false"

        System.out.println("\nFor 1");
        for (int chave: usuarios.keySet()){
            System.out.println(chave);
        }
        System.out.println("\nFor 2");
        for (String value: usuarios.values()){
            System.out.println(value);
        }
        System.out.println("\nFor 3");
        for (Entry<Integer, String> registro: usuarios.entrySet()){
//          System.out.println(registro); 1=Ricardo
            System.out.print(registro.getKey() + " ");
            System.out.println(registro.getValue());
        }
    }
}
