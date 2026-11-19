package projects.commerce;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<CartItem> cartItems = new ArrayList<>();

    public List<CartItem> getCartItems() {
        return new ArrayList<>(cartItems);
    }

    public void addCartItem(CartItem cartItem) {
        for (CartItem item : cartItems) {
            if (item.getProduct().getName().equals(cartItem.getProduct().getName())) {
                item.addQuantity();
                return;
            }
        }
        this.cartItems.add(cartItem);
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (CartItem cartItem : cartItems) {
            totalPrice += cartItem.getQuantity() * cartItem.getProduct().getPrice();
        }
        return totalPrice;
    }

    public void clearCartItems() {
        this.cartItems.clear();
    }

    public boolean isEmpty() {
        return cartItems.isEmpty();
    }

    public int countProduct(Product product) {
        int cartQuantity;
        for (CartItem cartItem : cartItems) {
            if (product.getName().equals(cartItem.getProduct().getName())) {
                cartQuantity = cartItem.getQuantity();
                return cartQuantity;
            }
        }
        return 0;
    }
}
