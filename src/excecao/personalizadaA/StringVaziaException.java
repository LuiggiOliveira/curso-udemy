package excecao.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {

    private final String nomeAtributo;

    public StringVaziaException(String nomeAtributo){
        this.nomeAtributo = nomeAtributo;
    }

    public String getMessage(){
        return String.format("O atributo '%s' está vazio", nomeAtributo);
    }
}
