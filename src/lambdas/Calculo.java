package lambdas;

@FunctionalInterface
public interface Calculo {

    double executar(double a, double b);
//    double testar(); -> com a notação @ ou não, apenas existe 1 método ABSTRACT em uma interface funcional, porém, pode-se ter sim outros
//    métodos desde que não sejam abstract.

    default String resultado(double a, double b){
        return "result: " + executar(a, b);
    }

    static String mensagem(){
        return "Só lembrando: não é possível usar um método de instância dentro de um método static!";
    }

}
