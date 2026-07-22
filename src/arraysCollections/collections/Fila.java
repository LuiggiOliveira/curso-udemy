package arraysCollections.collections;

import java.util.LinkedList;
import java.util.Queue;

//CTRL + ALT + seta para baixo/cima -> eu consigo selecionar em várias linhas as quais eu quero editar ao mesmo tempo
//ALT + click do mouse -> eu consigo selecionar e editar ao mesmo tempo todas os lugares que eu cliquei
//ALT + cima/baixo -> muda a linha selecionada para cima ou para baixo
public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        /* OFFER e ADD adicionam elementos à fila,
        porém, quando está cheio, o offer retorna false e o add lança exceção */
        System.out.println("ADD e OFFER");
        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Clara");
        fila.offer("Lia");
        fila.add("Alana");
        fila.offer("Bianca");
        System.out.println("Usando 'contains()': " + fila.contains("Ana"));
        /* PEEK e ELEMENT pegam o próximo valor da fila,
        só que peek lança null e element retorna exceção se a fila estiver vazia */
        System.out.println(fila);
        System.out.println("\nPEEK e ELEMENT");
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());

        System.out.println("\nSIZE, IsEMPTY e CLEAR");
        System.out.println(fila.size());
        System.out.println(fila.isEmpty());
        //fila.clear();
        System.out.println(fila.isEmpty());

        //ambos removem, porém, com o POLL ele retorna null se a fila estiver vazia. Já REMOVE retorna exceção
        System.out.println("\nPOLL e REMOVE");

        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila);
        System.out.println(fila.poll()); //null
        System.out.println(fila.remove()); //exceção

        /*
        RESUMO:
        add | offer -> (cheio) IllegalStateException | true ou false -> ADICIONAR elementos ao FIM da fila
        element | peek -> (vazia) NoSuchElementException | null -> PEGAR o PRÓXIMO elemento da fila
        remove | poll -> (vazia) NoSuchElementException | null -> REMOVER o PRÓXIMO elemento da fila
        isEmpty -> verifica se a fila está vazia
        clear -> limpa todos os espaços da fila
        size -> conta quantos espaços tem na fila, ou melhor, o tamanho dela
         */

    }
}
