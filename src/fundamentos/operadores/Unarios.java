package fundamentos.operadores;

public class Unarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        //pós-fixada (retorna o valor da variável primeiro, depois a incrementa/decrementa)
        a++; //a = a + 1
        a--; //a = a - 1

        //pré-fixada (incrementa/decrementa a variável primeiro, depois retorna o seu valor)
        ++b; // b = b + 1;
        --b; // b = b - 1;

        System.out.println(a);
        System.out.println(b);

        //Aqui é questão de precedência dos operadores
        //primeiro incrementa a, depois compara a com b e só depois que decrementa b
        //ou seja: 1. a(1) + 1 = 2; 2. a(2) == b(2)? true (ARMAZENA VALOR DA COMPARAÇÃO); 3. só depois decrementa, porém já guardou
        //que a == b é true e só na linha seguinte que b irá aparecer como 1
        System.out.println(++a == b--); //LEMBRANDO QUE AQUI VAI INCREMENTAR/DECREMENTAR O VALOR MESMO USANDO ==
        System.out.println(a);
        System.out.println(b);

        //ESSE TIPO DE COISA NÃO É RECOMENDADO, JÁ QUE... COMO DIRIA UM GRANDE SÁBIO:
        //"É mais fácil complicar as coisas simples, do que simplificar com complicadas"
        //é mais fácil escrever um código complicado, do que escrever um código simples
        //dica: quebrar o código em partes pequenas e as reusar em outras partes do código (ou seja, quebrar elas em
        //funções menores)
    }
}
