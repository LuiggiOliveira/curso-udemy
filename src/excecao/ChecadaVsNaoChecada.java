package excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) throws Exception {

        // Throwable > Exception (verificadas) > RunTimeException

        // Por ser RunTimeException (ou até uma subclasse derivada dessa), é opcional tratar a exceção. Além disso,
        // uma exceção checada, ela pode passar despercebida pelos métodos, diferentemente das não checadas
        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());;
        }

        // Já aqui não é obrigatório tratar a exceção que herde direta ou indiretamente de Exception, exceto RunTimeException.
        // Porém, a exceção checada que passa por um método, deve ou tratar ou lançar novamente essa mesma exceção para outro método
        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim do programa.");
    }

    // Exceção NÃO checada ou NÃO verificada
    static void geraErro1() { // por ser RunTimeException, não necessita tratar a exceção, diferentemente da Exception
        throw new RuntimeException("Ocorreu um erro #01");
    }

    // Exceção checada ou verificada
    static void geraErro2() throws Exception {
        throw new Exception("Ocorreu um erro #02");
    }
}
