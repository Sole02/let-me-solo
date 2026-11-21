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

    public void addProduct(Product product) {
        for (Product savedProduct : productList) {
            if (savedProduct.getName().equals(product.getName())) {
                throw new IllegalArgumentException("이미 존재하는 상품입니다.");
            }
        }
        productList.add(product);
    }

    public Product findProduct(String productName) {
        for (Product product : productList) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }
}
