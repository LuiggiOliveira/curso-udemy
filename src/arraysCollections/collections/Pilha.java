package arraysCollections.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<String>();

        // Insere no topo da pilha. Se encher Add retorna "true" se encher e Push retorna erro.
        livros.add("O Pequeno Príncipe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");
        livros.push("Java: Como Programar");

        // Pega o elemento do topo da pilha. Peek retorna null e Element retorna exceção se estiver vazia.
        System.out.println(livros.peek());
        System.out.println(livros.element());
        System.out.println("---- For each -----");
        for (String s: livros){
            System.out.println(s);
        }
        System.out.println("------------------");
        // Remove o elemento do topo da pilha. Poll retorna null e Remove e Pop retornam exceção se a pilha estiver vazia
        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.remove());
        System.out.println(livros.poll());
        System.out.println(livros.poll()); //null
        System.out.println(livros.pop()); //exception
        // System.out.println(livros.remove()); exception

        // livros.size();
        // livros.clear();
        // livros.contains();
        // livros.isEmpty();

    }
}
