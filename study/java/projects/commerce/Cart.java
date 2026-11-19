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
            if (item.getName().equals(cartItem.getName())) {
                item.addQuantity();
                return;
            }
        }
        this.cartItems.add(cartItem);
    }
}
