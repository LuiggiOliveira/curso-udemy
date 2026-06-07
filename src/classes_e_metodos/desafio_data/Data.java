package classes_e_metodos.desafio_data;

public class Data {
    public int dia, mes, ano;
    /*
    Nota: UMA VARIÁVEL *LOCAL* NÃO É INICIALIZADA POR PADRÃO!
    Nota2: ao criar uma variável final, deve-se sempre definir o valor dela antes de carregar o construtor
    ou mesmo dentro dele
    Nota3: Já para uma variável static, já vem com o valor padrão
    */

    //Eu não posso criar um construtor que recebe 1 parâmetro do tipo int e criar outro que também recebe 1 parâmetro do tipo int
    //se não dá o mesmo problema ao criar dois métodos com mesma assinatura, ou seja, mesmo nome e parâmetros
    public Data(int dia, int mes, int ano){
        //this() -> se eu fizesse isso, chamaria o Data() que chamaria esse construtor e assim chamaria novamente Data()...
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(){
        /*this.dia = 1;
        this.mes = 1;
        this.ano = 1970;*/

        //Num construtor, chama outro construtor da classe com base nos parâmetros. Além disso, não pode usar dentro de métodos
        this(1, 1, 1970);
    }

    //diferentemente do paradigma funcional, eu posso criar uma função que chama outra que é criada só depois dessa
    public void imprimirData(){
        System.out.println(this.obterDataFormatada());
    }
    /* outra observação é que esse tipo de métod.o não vai funcionar em aplicações que não são terminais,
    ou seja, é mais interessante que retorne o valor de fato */

    public String obterDataFormatada(){
        //nota: não é possível criar uma variável local com o modificador "static" dentro de um método (já "final" pode)
        String diaFormatado = this.dia > 9 ? Integer.toString(this.dia) : "0" + this.dia; // 31 -> 31 || 9 -> 09
        String mesFormatado = this.mes > 9 ? Integer.toString(this.mes) : "0" + this.mes;
        final String formato = "%s/%s/%s";
        return String.format(formato, diaFormatado, mesFormatado, this.ano); //detalhe que eu nem converti ano para String
    }

    //IGNORAR
    void teste(){
        System.out.println("Teste");
    }

    void teste(int a){
        System.out.println("Teste " + a);
    }

}
