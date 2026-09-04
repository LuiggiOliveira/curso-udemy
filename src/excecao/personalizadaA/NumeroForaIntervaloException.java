package excecao.personalizadaA;

@SuppressWarnings("serial") // serializar: transformar um objeto em um arquivo de texto
public class NumeroForaIntervaloException extends RuntimeException {

    private final String nomeAtributo;

    public NumeroForaIntervaloException(String nomeAtributo){
        this.nomeAtributo = nomeAtributo;
    }

    public String getMessage(){
        return String.format("O atributo '%s' está fora do intervalo", nomeAtributo);
    }
}
