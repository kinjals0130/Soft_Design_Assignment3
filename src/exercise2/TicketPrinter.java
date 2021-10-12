package exercise2;

/**
 * View
 * Prints on paper the scanned or manually entered item name and price
 */
public class TicketPrinter implements View {
    /**
     * Prints some text on the paper.
     * @param text: the text that gets displayed
     */
    public void displayProduct(String text){
        System.out.println("-------------Ticket Printer-------------");
        System.out.println(text);
    }
}
