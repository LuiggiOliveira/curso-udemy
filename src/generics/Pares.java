package generics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class  Pares<C extends Number, V> {

    //LinkedHashSet, diferentemente de HashSet, ele mantém a ordem de inclusão
    //E o TreeSet precisa do Comparable que vai definir como os dados serão ordenados dentro do TreeSet
    private final Set<Par<C, V>> itens = new LinkedHashSet<>(); // TreeSet, pois vai utilizar a ordem de inserção

    public void adicionar(C chave, V valor) {
        if (chave == null) return;

        Par<C, V> novoPar = new Par<>(chave, valor);

        // por ser Set e no equals e hashCode compara pela chave, se não remover, ele simplesmente ignora a linha 21
        if (itens.contains(novoPar)) {
            itens.remove(novoPar);
        }

        itens.add(novoPar);
    }

    public V getValor(C chave) {
        if(chave == null) return null;

        Optional<Par<C, V>> parOpcional = itens.stream()
                .filter(par -> chave.equals(par.getChave()))
                .findFirst();

        return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
        // Seria o mesmo que parOpcional.map(Par::getValor).orElse(null);
    }
}
