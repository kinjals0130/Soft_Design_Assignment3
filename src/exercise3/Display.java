package exercise3;

import java.util.Observable;
import java.util.Observer;

/**
 * View
 * Graphical display of scanned or manually entered item name and price
 */
public class Display implements Observer {
    /**
     * Displays some text on the screen
     *
     * @param text: the text that gets displayed
     */
    public void displayText(String text) {
        System.out.println("-------------Display-------------");
        System.out.println(text);
    }

    @Override
    public void update(Observable o, Object arg) {
        displayText(String.valueOf(arg));
    }
}
