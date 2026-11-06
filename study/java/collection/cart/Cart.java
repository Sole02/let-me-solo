package collection.cart;

import java.util.ArrayList;

public class Cart {

    static ArrayList<Product> cart = new ArrayList<>();

    public static void main(String[] args) {

    }

    public static void addProduct(Product product) {
        cart.add(product);
    }

    public static void printCart() {
        for (int i = 0; i < cart.size(); i++) {
            System.out.println(cart.get(i).name + ": " + cart.get(i).price);
        }
    }

    public static void removeProduct(String name) {
        for (int i = 0; i < cart.size(); i++) {
            String productName = cart.get(i).name;
            if (name.equals(productName)) {
                cart.remove(cart.get(i));
                return;
            }
        }
        System.out.println("장바구니에 없는 상품입니다.");
    }

    public static void calculateTotalPrice() {
        int totalPrice = 0;

        for (int i = 0; i < cart.size(); i++) {
            totalPrice += cart.get(i).price;
        }
        System.out.println("총 금액: " + totalPrice);
    }

    public static void printPrice(String name) {
        for (int i = 0; i < cart.size(); i++) {
            String cartName = cart.get(i).name;
            int cartPrice = cart.get(i).price;
            if (name.equals(cartName)) {
                System.out.println(cartName + ": " + cartPrice + "원");
                return;
            }
        }
        System.out.println("장바구니에 없는 상품입니다.");
    }
}
