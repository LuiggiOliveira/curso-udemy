package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

    private final List<ChegadaAniversarianteObserver> observers = new ArrayList<>();

    public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer) {
        this.observers.add(observer);
    }

    public void monitorar() {
        Scanner sc = new Scanner(System.in);

        String valor = "";

        while(!"sair".equalsIgnoreCase(valor)) {

            System.out.println("O aniversariante chegou?");
            valor = sc.nextLine();

            if("sim".equalsIgnoreCase(valor)) {

                ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());
                System.out.println(event.getHoraDaChegada());

                //Notificar observadores
                observers.forEach(o -> o.chegou(event)); //ou observers.stream().foreach(...)
                valor = "sair";
            } else {
                System.out.println("alarme falso.");
            }
        }

        sc.close();
    }

}
