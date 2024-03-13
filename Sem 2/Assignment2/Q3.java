class Product {
    int prodId;
    double price;
    int quantity;
    static double totalPrice;

    public Product(int prodId, double price, int quantity) {
        this.prodId = prodId;
        this.price = price;
        this.quantity = quantity;
        totalPrice += price * quantity;
    }

    void display() {
        System.out.println("Product ID: " + prodId);
        System.out.println("Price: " + price + " INR");
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Item Price: " + (price * quantity) + " INR");
        System.out.println("--------------------");
    }

    double getTotalPrice() {
        return totalPrice;
    }

}
public class Q3 {
    public static void main(String[] args) {
        Product product1 = new Product(101, 115.99, 2);
        Product product2 = new Product(102, 512.45, 1);
        Product product3 = new Product(103, 93.75, 3);
        Product product4 = new Product(104, 18.20, 4);
        Product product5 = new Product(105, 227.10, 1);

        System.out.println("Product Details:");
        product1.display();
        product2.display();
        product3.display();
        product4.display();
        product5.display();

        System.out.println("\nTotal Payable Amount: " + product5.getTotalPrice() + " INR");
    }
}

/*
 *
 * Product Details:
 * Product ID: 101
 * Price: 115.99 INR
 * Quantity: 2
 * Total Item Price: 231.98 INR
 * --------------------
 * Product ID: 102
 * Price: 512.45 INR
 * Quantity: 1
 * Total Item Price: 512.45 INR
 * --------------------
 * Product ID: 103
 * Price: 93.75 INR
 * Quantity: 3
 * Total Item Price: 281.25 INR
 * --------------------
 * Product ID: 104
 * Price: 18.2 INR
 * Quantity: 4
 * Total Item Price: 72.8 INR
 * --------------------
 * Product ID: 105
 * Price: 227.1 INR
 * Quantity: 1
 * Total Item Price: 227.1 INR
 * --------------------
 *
 * Total Payable Amount: 1325.58 INR
 *
 *
 *  Note: Since this topic is not yet covered in my class i took
 *        some help from ai so please verify before using this code!
 */