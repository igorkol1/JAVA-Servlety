package commons;

public class CartItem {

    private String productName;
    private double price;
    private int quantity;

    public CartItem(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSum(){
        return price*quantity;
    }

    @Override
    public String toString() {
        return productName+" - "+quantity+" x "+price+"zł = "+price*quantity+"zł";
    }
}
