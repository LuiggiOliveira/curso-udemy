package arraysCollections.collections;

import java.util.ArrayList; //implementar List, sendo uma classe concreta
//import java.util.List; interface

public class List {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");

        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Penny"));
        lista.add(new Usuario("Carlos"));
        
        //System.out.println(lista.get(3).nome);
        System.out.println(lista.get(3)); //isso deu certo de aparecer o nome porque sobrescrevi toString()
        System.out.println();

        //lista.remove(2); lista.remove(new Usuario("Penny"));
        System.out.println(">>> " + lista.remove(2)); //remove e retorna o objeto que removi (que nem pop() do python)
        System.out.println(lista.remove(new Usuario("Penny"))); //remove e retorna um valor booleano (que nem pop() mas retornando boolean)
        System.out.println(lista.contains(new Usuario("Lia")));
        System.out.println("Hashcode de Ana: " + u1.hashCode());
        for (Usuario u : lista){
            System.out.println(u); //sem sobrescrever toString(), eu precisaria de "u.nome"
        }

        /*E como eu suspeitava... quando imprimo no console e/ou concateno ou até em outros cenários, implicitamente chama o toString()
        e como eu sobrescrevi ele, então irá chamar esse método mesmo sem eu usar notação ponto diretamente.*/
    }
}
