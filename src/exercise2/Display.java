package exercise2;

/**
 * View
 * Graphical display of scanned or manually entered item name and price
 */
public class Display implements View{
    /**
     * Displays some text on the screen
     * @param product: the Product that gets displayed
     */

    public void displayProduct(Product product){
        System.out.println("-------------Display-------------");
        System.out.println(product.toString());
    }
}
