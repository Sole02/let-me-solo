package projects.commerce;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private List<Product> productList;
    private String name;

    public Category(List<Product> productList, String name) {
        this.productList = new ArrayList<>(productList);
        this.name = name;
    }

    public List<Product> getProductList() {
        return new ArrayList<>(productList);
    }

    public String getName() {
        return name;
    }
}
