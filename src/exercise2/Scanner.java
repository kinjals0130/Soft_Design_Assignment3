package exercise2;

/**
 * Controller
 * Capture of UPC code using a bar scanner
 */
public class Scanner {
    private CashRegister cashRegister = new CashRegister();

    /**
     * Capture of UPC code using a bar scanner
     * @param UPCCode: barcode value
     */
    public void scannedUPCCode(int UPCCode) {
        this.cashRegister.setCurrentProductUPC(UPCCode);
    }
}
