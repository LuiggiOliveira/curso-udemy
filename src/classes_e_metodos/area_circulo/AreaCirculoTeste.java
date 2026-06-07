package classes_e_metodos.area_circulo;

import java.awt.geom.Area;

public class AreaCirculoTeste {
    public static void main(String[] args) {
        AreaCirculo a1 = new AreaCirculo(5);
        AreaCirculo a2 = new AreaCirculo(10);
        AreaCirculo a3 = new AreaCirculo(15);

        //acesso à variável static da mesma forma que chamo um método static utilizando o nome da classe
        System.out.println("Número de instâncias da classe AreaCirculo: " + AreaCirculo.objetos_criados);
        System.out.println("O valor de PI é: " + AreaCirculo.PI);

        double raioQualquer = 100;
        System.out.printf("Área do primeiro círculo: %.2f m\n", a1.area());
        System.out.printf("Área do segundo círculo: %.2f m\n", a2.area());
        System.out.printf("Área do terceiro círculo: %.2f m\n", a3.area());
        System.out.printf("Área de um círculo qualquer: %.2f m (raio %.1f)", AreaCirculo.area(raioQualquer), raioQualquer);
    }
}
