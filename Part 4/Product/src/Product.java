public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String initialName, double initialPrice, int initialQuality) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuality;
    }

    public void printProducts() {
        System.out.println(this.name + ", " + "price " + this.price + ", " + this.quantity + " pcs");
    }
}
