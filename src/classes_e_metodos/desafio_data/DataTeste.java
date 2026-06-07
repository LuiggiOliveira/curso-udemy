package classes_e_metodos.desafio_data;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data(3, 5, 2022);
        //d1.dia = 25;
        //d1.mes = 5;
        //d1.ano = 2026;

        Data d2 = new Data();

        System.out.print("Data 1: ");
        d1.imprimirData();
        System.out.println("Data 2: " + d2.obterDataFormatada());

        System.out.println("\n---- Ignorar ----");
        //metodos quase iguais, só muda o parâmetro. Sobrecarga de métodos (além de que existe a sobrecarga de construtores)
        d1.teste();
        d1.teste(1);

        /*
        o java reclama se eu colocar por exemplo: void teste() e int teste(), já que a identidade/assinatura do méto.do é "teste()"
        mesmo se colocar tipos diferentes de retorno. Porém, ao colocar mesmo tipo e mesmo nome, mas quantidade de parâmetros
        diferente ele não reclama. Outra coisa é que a assinatura conta também com o tipo do parâmetro.

        ASSINATURA: nome + tipos e quantidades de parâmetros
        void teste(int a) != void teste(double a)
        */
    }
}
