package exercise3;

import java.util.Observable;
import java.util.Observer;

/**
 * View
 * Prints on paper the scanned or manually entered item name and price
 */
public class TicketPrinter implements Observer {
    /**
     * Prints some text on the paper.
     *
     * @param text: the text that gets displayed
     */
    public void displayText(String text) {
        System.out.println("-------------Ticket Printer-------------");
        System.out.println(text);
    }

    @Override
    public void update(Observable o, Object arg) {
        displayText(String.valueOf(arg));
    }
}
