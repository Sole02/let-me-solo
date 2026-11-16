package projects.commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        productList.add(new Product("AW2721D 모니터", 1250000, "27인치 게이밍 모니터", 11));
        productList.add(new Product("G PRO X2 SUPERSTRIKE", 259000, "게이밍 마우스", 25));
        productList.add(new Product("G PRO X TKL RAPID", 249000, "게이밍 키보드", 10));
        productList.add(new Product("Razer BlackShark V3", 239000, "게이밍 헤드셋", 25));

        int number = 0;
        for (Product product : productList) {
            number++;
            System.out.print(number + ". 제품 이름: " + product.name + " | ");
            System.out.print("가격: " + product.price + " | ");
            System.out.print("설명: " + product.description + " | ");
            System.out.println("수량: " + product.stockQuantity);
        }

        System.out.println("0. 종료");
        int input = scanner.nextInt();
        if (input == 0) {
            System.out.println("커머스 플랫폼을 종료합니다.");
        }
    }
}
