import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Se divertindo ao descobrir como ler um arquivo .txt pelo Java... Deveras interessante. Acabei lembrando de
// como se instanciava o Scanner e ao ler o que o java diz sobre ele, acabei descobrindo que dá para ler um arquivo com ele.
// Portanto, cá estamos.

public class LerArquivo {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\LuiggiDev\\Desktop\\Python\\README.md");
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }
}

