package collection.cart;

public class Main {

    public static void main(String[] args) {

        Product onion = new Product("양파", 1000);
        Cart.addProduct(onion);

        Product apple = new Product("사과", 1500);
        Cart.addProduct(apple);

        Product fish = new Product("생선", 2200);
        Cart.addProduct(fish);

        Product tofu = new Product("두부", 800);
        Cart.addProduct(tofu);

        Cart.printCart();
        Cart.calculateTotalPrice();

        Cart.removeProduct("사과");
        Cart.printCart();

        Cart.printPrice("생선");
        Cart.printPrice("수박");

    }


}
