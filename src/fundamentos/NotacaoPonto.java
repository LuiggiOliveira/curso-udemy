package fundamentos;

//lembrando só algumas coisinhas que eu vi nas aulas passadas: -> jshell, var (atribui automaticamente o tipo da variavel),
//e usar o '_' para separar números grandes, por ex: 1_000_000 (mesmo que talvez eu nem vá usar essas coisas)

public class NotacaoPonto {
    public static void main(String[] args) {
        //tipos primitivos numéricos não possuem operador . que nem String, por exemplo

        String a = "Bom dia X";
        a = a.replace("X", "Mr. White");
        a = a.toUpperCase();
        a = a.concat("!!!");
        System.out.println(a);

        String b = "and Ms. Skyler"
                .toUpperCase()
                .concat("!!!");
        System.out.print(b);
    }
}
