package exercise1;

public class TestCashRegisterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        Keyboard keyboard = new Keyboard();

        scanner.scannedUPCCode(1234);
        keyboard.setUPCCode(5678);
    }
}
