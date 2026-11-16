package projects.commerce;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("AW2721D 모니터", 1250000, "27인치 게이밍 모니터", 11));
        productList.add(new Product("G PRO X2 SUPERSTRIKE", 259000, "게이밍 마우스", 25));
        productList.add(new Product("G PRO X TKL RAPID", 249000, "게이밍 키보드", 10));
        productList.add(new Product("Razer BlackShark V3", 239000, "게이밍 헤드셋", 25));

        CommerceSystem commerceSystem = new CommerceSystem(productList);

        commerceSystem.start();
    }
}
