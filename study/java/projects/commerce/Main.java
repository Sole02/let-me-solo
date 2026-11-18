package projects.commerce;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CommerceSystem commerceSystem = new CommerceSystem(createCategories());

        commerceSystem.start();
    }

    public static List<Category> createCategories() {

        List<Product> electronicsList = new ArrayList<>();
        List<Product> clothingList = new ArrayList<>();
        List<Product> foodList = new ArrayList<>();

        electronicsList.add(new Product("AW2721D 모니터", 1250000, "27인치 게이밍 모니터", 11));
        electronicsList.add(new Product("G PRO X2 SUPERSTRIKE", 259000, "게이밍 마우스", 25));
        electronicsList.add(new Product("G PRO X TKL RAPID", 249000, "게이밍 키보드", 10));
        electronicsList.add(new Product("Razer BlackShark V3", 239000, "게이밍 헤드셋", 25));

        clothingList.add(new Product("나이키 에어포스 운동화", 139000, "운동화", 25));

        foodList.add(new Product("복숭아 2kg", 24900, "고당도 딱딱한 복숭아 1박스 2kg", 25));

        List<Category> categoryList = new ArrayList<>();

        categoryList.add(new Category(electronicsList, "전자제품"));
        categoryList.add(new Category(clothingList, "의류"));
        categoryList.add(new Category(foodList, "식품"));

        return categoryList;
    }
}
