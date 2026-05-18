package fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;
        System.out.println("TESTE 1 (cond1 = true | cond2 = false) :");
        System.out.println(condicao1 && condicao2); //AND -> [1*1=1], 1*0=0, 0*1=0, 0*0=0
        System.out.println(condicao1 || condicao2); //OR -> 1+1=1, 1+0=1, 0+1=1, [0+0=0]
        System.out.println(condicao1 ^ condicao2); //XOR (OU exclusivo) -> OU p, OU c -> negação de bicondicional -> 0 1 ou 1 0 apenas
        System.out.println(!condicao1); //negação (ou inversor)
        System.out.println(!condicao2);
        System.out.println("dupla negação de cond2: " + !!condicao2); //dupla negação

        condicao1 = !true;
        condicao2 = !(3 > 7);
        //após inverter as condições
        System.out.println("\nTESTE 2 (cond1 = false | cond2 = true) :");
        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2); //se mantém TRUE, pois ainda cai nos casos 0 1 ou 1 0
        //para XOR ser FALSE, tem que ser: (XOR se eu não me engano é !A*B + A*!B)
        condicao1 = true;
        condicao2 = true;
        System.out.println("\nTESTE 3 (cond1 = true | cond2 = true) :");
        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        //OU
        condicao1 = false;
        condicao2 = false;
        System.out.println("\nTESTE 4 (cond1 = false | cond2 = false) :");
        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
    }
}
