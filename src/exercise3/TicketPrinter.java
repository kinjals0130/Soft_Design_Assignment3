package exercise3;

import java.util.Observable;
import java.util.Observer;

/**
 * Prints on paper the scanned or manually entered item name and price
 */
public class TicketPrinter implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("-------------Ticket Printer-------------");
        System.out.println(arg);
    }
}
