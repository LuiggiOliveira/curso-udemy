package padroes.observer;

public class AniversarioSurpresa {

    public static void main(String[] args) {
        Porteiro porteiro = new Porteiro();

        Namorada namorada = new Namorada();
        //registra a INTENÇÃO do Observer (interessado no evento)
        porteiro.addChegadaAniversarianteObserver(namorada);

        // Ou também... Via lambda sem a necessidade de um observador, recebendo o evento e já enviando a mensagem
        porteiro.addChegadaAniversarianteObserver(e -> {
                    System.out.println("Surpresa via lambda!");
                    System.out.println("Ocorreu em: " + e.getHoraDaChegada());
                });
        porteiro.monitorar();
    }
}
