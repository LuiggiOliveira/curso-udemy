package classes_e_metodos.area_circulo;


public class AreaCirculo {
    double raio;
    static final double PI = 3.1415; //caso não fosse final, ao sobrescrever seu valor, iria sobrescrever para todas instâncias
    static int objetos_criados;

    AreaCirculo(double raio){
        //se eu colocar raio = raio, dará problema já que eu tenho um atributo e um parâmetro de mesmo nome, para isso coloco this
        this.raio = raio;
        objetos_criados++;
    }

    double area() {
        return raio * raio * PI; //ou Math.pow(raio,2) * PI
    }

    static double area(double raio){
        return Math.pow(raio,2) * PI;
    }

}
