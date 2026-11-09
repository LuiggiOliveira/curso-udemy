import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.InputEvent;

public class AutoClicker {
    public static boolean running = true;

    public static void main(String[] args) throws AWTException, InterruptedException {

        // Detecta a tecla 'q' para parar
        Toolkit.getDefaultToolkit().addAWTEventListener(
                e -> {
                    if (e.getID() == KeyEvent.KEY_PRESSED
                                && ((KeyEvent) e).getKeyChar() == 'q') {
                        running = false;
                    }
                },
                java.awt.AWTEvent.KEY_EVENT_MASK
        );

        Robot robot = new Robot();
        int x = 100;
        int y = 100;
        long intervalo = 10000; // 1 segundo (em ms)

        Point posOriginal = MouseInfo.getPointerInfo().getLocation();

        System.out.println("Auto-clicker ativo. Pressione 'q' para parar.");

        while (running) {
            robot.mouseMove(x, y);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseMove(posOriginal.x, posOriginal.y);
            Thread.sleep(intervalo);
        }

        System.out.println("Auto-clicker parado.");
    }
}
