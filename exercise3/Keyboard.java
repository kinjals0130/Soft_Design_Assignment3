public class Keyboard {

  //Model
private final CashRegister cashRegister; 

public Keyboard(CashRegister cashRegister ) {
this.cashRegister = cashRegister;
}

public void setUpcCode(long upcCode) {
cashRegister.setCurrentProductUPC(upcCode);
}
}

