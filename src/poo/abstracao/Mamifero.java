package poo.abstracao;

public abstract class Mamifero extends Animal {

    public abstract String mamar();

    // É possível "livrar" as suas subclasses de implementar o método abstrato da classe pai. Ex:
    public final String mover(){ // final -> não pode ser sobrescrito nas subclasses
        return "Saindo do lugar"; //se torna um método concreto que não pode ser sobrescrito (oposto de método abstrato)
    }
}
