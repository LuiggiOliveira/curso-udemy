package padroes.observer;

@FunctionalInterface
public interface ChegadaAniversarianteObserver {

    void chegou(ChegadaAniversarianteEvent event);
}
