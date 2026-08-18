package poo.encapsulamento.casaA;

public class Ana {
    public String nome = "Ana";
    protected String segredoFamiliar = "Dívidas ocultas";
    String rotina = "café -> banho -> trabalho -> almoço -> academia -> jantar -> dormir"; // modificador de acesso: default
    private String segredoPessoal = "É uma agente secreta da CIA";

    void testeAcessos() {
        System.out.println(nome);
        System.out.println(segredoFamiliar);
        System.out.println(rotina);
        System.out.println(segredoPessoal);
    }

    public static void main(String[] args) {
        Ana ana = new Ana();

        ana.testeAcessos(); //aqui obviamente ela vai poder acessar as próprias informações, incluindo é claro o próprio segredo
    }
}
