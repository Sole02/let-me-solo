package projects.commerce;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    List<Product> products;

    public CommerceSystem(List<Product> products) {
        this.products = products;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        for (Product product : products) {
            number++;
            System.out.print(number + ". 제품 이름: " + product.name + " | ");
            System.out.print("가격: " + product.price + "원 | ");
            System.out.print("설명: " + product.description + " | ");
            System.out.println("수량: " + product.stockQuantity);
        }

        System.out.println("0. 프로그램 종료");
        int input = scanner.nextInt();
        if (input == 0) {
            System.out.println("커머스 플랫폼을 종료합니다.");
        }
    }
}
