package collection.cart;

public class Product {

    public String name;
    public int price;


    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    public int getPrice() {
        return this.price;
    }
}
