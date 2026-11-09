package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        String s1 = new String("2"); //se eu fizesse String s = "2" iria dar true, mas agora dessa forma dá false
        System.out.println("2" == "2"); //aqui dá true, mas nem sempre isso funciona
        System.out.println("2" == s1); //false
        System.out.println("2".equals(s1));//true

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 2 para mostrar que realmente não é interessante usar == para comparar Strings: ");
        String s2 = sc.nextLine();
        System.out.println("2" == s2.trim());//o trim retira os espaços em brancos, exemplo "  2" -> "2"
        System.out.println("2".equals(s2.trim()));

        String s3 = "coisa";
        System.out.println(s3 == "coisa");

        String s = new String("texto");
        String interned = s.intern(); //intern(): permite colocar explicitamente uma string no pool em runtime
        //se o literal "texto" já estiver no pool (porque aparece em algum lugar do código), intern() retorna a referência do pool.
        //se não houver nenhum literal com esse valor no código, intern() copia o conteúdo para o pool e retorna essa referência.

    // interned agora aponta para o objeto no pool
    // s ainda aponta para o objeto fora do pool
        System.out.println(s == interned);  // false (em geral*)
        System.out.println(s.equals(interned)); // true

        // RESUMINDO PARA NUNCA MAIS ESQUECER: Sempre que carrega a classe, as Strings estáticas (ex: String s = "texto")
        // são guardadas em um lugar especial da heap chamado String Pool, enquanto as String dinâmicas são aquelas que surgem
        // em runtime (ex: String s = new String("texto")). Quando comparamos com == ele só vai verificar sem ambas Strings
        // apontam para o mesmo objeto, isto é, para o mesmo endereço.
        sc.close();
    }
}
