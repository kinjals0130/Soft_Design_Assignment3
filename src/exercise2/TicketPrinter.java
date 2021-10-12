package exercise2;

/**
 * View
 * Prints on paper the scanned or manually entered item name and price
 */
public class TicketPrinter implements View {
    /**
     * Prints some text on the paper.
     * @param product: the Product that gets displayed
     */
    public void displayProduct(Product product){
        System.out.println("-------------Ticket Printer-------------");
        System.out.println(product);
    }
}
