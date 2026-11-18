package projects.commerce;

import java.util.List;

public class Category {

    List<Product> productList;
    String name;

    public Category(List<Product> productList, String name) {
        this.productList = productList;
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
