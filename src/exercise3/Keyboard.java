package exercise3;

/**
 * Controller
 * Manual input of a UPC code
 */
public class Keyboard {
    private CashRegister cashRegister = new CashRegister();

    /**
     * Saves the UPC code entered by cashier
     *
     * @param UPCCode: barcode value
     */
    public void setUPCCode(int UPCCode) {
        this.cashRegister.setCurrentProductUPC(UPCCode);
    }
}
