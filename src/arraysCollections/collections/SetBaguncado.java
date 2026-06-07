package arraysCollections.collections;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"rawtypes", "unchecked"}) //ALT + ENTER
public class SetBaguncado {
    public static void main(String[] args) {
        //sets -> não ordenados (default), não indexados, não permite repetições, permite heterogeneidade de dados (não recomendável)

        HashSet conjunto = new HashSet();

        //conjunto.add(); mostra "Object e" dentro dos parênteses
        conjunto.add(1.2); //double -> Double
        conjunto.add(false); //boolean -> Boolean
        conjunto.add("Teste"); //String não precisa
        conjunto.add(1); //int -> Integer
        conjunto.add('x'); //char -> Caractere
        System.out.println("Tamanho é: " + conjunto.size());

        conjunto.add("teste"); //não pode repetir, porém aqui muda então pode
        conjunto.add('x'); //já aqui não, então só ignora ele
        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.remove("teste")); //remove, então: true
        System.out.println(conjunto.remove("teste")); //não existe, então: false
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.contains('x')); //false, pois foi removido
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));
        System.out.println(conjunto.contains(false));

        Set nums = new HashSet(); //Set herda de Hashset, então isso é possível
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums); //UNIÃO de conjunto com nums, ou seja, junta tudo
        System.out.println(conjunto);
        conjunto.retainAll(nums); //INTERSECÇÃO entre ambos conjuntos, retornando só o que há de em comum entre eles
        System.out.println(conjunto);

        conjunto.clear(); //Adivinha o que ele faz...
        System.out.println(conjunto);
        //alguns desses métodos também estão presentes em outros tipos de collections (List, Map, Queue, Stack, ...)
    }
}
