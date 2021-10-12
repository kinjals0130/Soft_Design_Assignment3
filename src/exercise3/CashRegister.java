package exercise3;

import java.util.Observable;

/**
 * Looks up the price and name of a product based on a UPC
 */
public class CashRegister extends Observable {
    private Display display = new Display();
    private TicketPrinter ticketPrinter = new TicketPrinter();
    private Product currentProduct;
    private ProductDB productDB = new ProductDB();
    private int UPCCode;

    /**
     * Sets the UPC code for current scanned product
     * @param UPCCode: barcode value
     */
    public void setCurrentProductUPC(int UPCCode) {
        this.UPCCode = UPCCode;
        this.currentProduct = this.getCurrentProductInfo();
        this.addObserver(display);
        this.addObserver(ticketPrinter);

        // Only print on the views if the product is defined
        if (this.currentProduct != null) {
            setChanged();
            notifyObservers(this.currentProduct.toString());
        }
    }

    /**
     * Gets the product information for the latest scanned product
     * @return - returns the current Product info
     */
    public Product getCurrentProductInfo() {
        currentProduct = this.productDB.GetProductInfo(this.UPCCode);
        return currentProduct;
    }
}
