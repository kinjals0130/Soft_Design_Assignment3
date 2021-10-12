package exercise3;

public class TestCashRegisterApp {
    public static void main(String[] args) {
        ScannerClass scanner = new ScannerClass();
        Keyboard keyboard = new Keyboard();

        scanner.scannedUPCCode(1234);
        keyboard.setUPCCode(5678);
    }
}
