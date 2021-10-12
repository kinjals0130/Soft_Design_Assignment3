package exercise3;

import java.util.Observable;
import java.util.Observer;

/**
 * Graphical display of scanned or manually entered item name and price
 */
public class Display implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("-------------Display-------------");
        System.out.println(arg);
    }
}
