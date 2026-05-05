package desafios_proprios;

//Simplesmente crie um programa em que eu possa cifrar uma mensagem (uma frase) e ainda decodificar uma mensagem

public class CifraBasica {
//     MAIN
    public static void main(String[] args) {
        CifraBasica cb = new CifraBasica();

        System.out.println(cb.cifrarSimples("Boa viagem meu Jovi"));
        System.out.println(cb.decifrarSimples("2 15 1 0 22 9 1 7 5 13 0 13 5 21 0 10 15 22 9"));
    }

//    BUSCA O ÍNDICE QUE CORRESPONDE À POSIÇÃO DA LETRA NO ALFABETO
    //Verifica se o caractere está no alfabeto, caso afirmativo, vai retornar a posição correspondente
    public int buscar_char_alfabeto(char char_msg){

        if (char_msg == ' '){return 0;}

        char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
                'r','s','t','u','v','w','x','y','z'};

        int indice = 0;
        for (int i = 0; i < alfabeto.length; i++){ //lembrar que: objeto.length != variavel.length()
            if (alfabeto[i] == char_msg){
                indice = i;
                break; //vai buscar a letra correspondente ao char da string e salvar sua posição
            }
        }
        return indice+1;
    }

//    CIFRANDO MENSAGEM
    //A=1, B=2, C=3,...,Z=26
    public String cifrarSimples(String msg){ //fiz pelo intellij
        msg = msg.toLowerCase(); //trata msg colocando tudo minúsculo
        String msg_cifrada = "";

        for (int i = 0; i < msg.length() ; i++){
            msg_cifrada = msg_cifrada + " " + buscar_char_alfabeto(msg.charAt(i));
        }
        return msg_cifrada;
    }

// CONVERSÃO DO ÍNDICE PARA A LETRA DO ALFABETO CORRESPONDENTE À SUA POSIÇÃO NELE
    public char index_to_letter(String indice){ //do nada meti um inglês porque não estava conseguindo pensar num nome bom
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int indice_int = Integer.parseInt(indice);

        if (indice_int == 0){return ' ';}

        int i;
        for (i = 0; i < alfabeto.length(); i++){
            if (indice_int == i+1){
                break;
            }
        }
        return alfabeto.charAt(i);
    }

//    DECIFRANDO MENSAGEM
    public String decifrarSimples(String msg_cifrada){
        String msg_decifrada = "";
        String[] indices = msg_cifrada.split(" ");

        for (String index : indices) {
            msg_decifrada = msg_decifrada + index_to_letter(index);
        }
        return msg_decifrada;
    } //fiz pelo gdbonline no pc da facul
}