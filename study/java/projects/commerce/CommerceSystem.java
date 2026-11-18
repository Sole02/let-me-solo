package projects.commerce;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    private List<Category> categories;

    public CommerceSystem(List<Category> categories) {
        this.categories = categories;
    }

    public void start() {

        Scanner scanner = new Scanner(System.in);

        int categoryInput = 1;
        int productInput = 1;

        while (categoryInput != 0) {
            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
            int number = 0;
            for (Category category : categories) {
                number++;
                System.out.println(number + ". " + category.getName());
            }
            System.out.println("0. 프로그램 종료");

            try {
                categoryInput = scanner.nextInt();
                if (categoryInput == 0) {
                    System.out.println("커머스 플랫폼을 종료합니다.");
                } else {
                    number = 0;
                    Category category = categories.get(categoryInput - 1);
                    System.out.println("[ " + category.getName() + " 카테고리 ]");
                    for (Product product : category.getProductList()) {
                        number++;
                        System.out.print(number + ". 제품 이름: " + product.getName() + " | ");
                        System.out.print("가격: " + product.getPrice() + "원 | ");
                        System.out.println("설명: " + product.getDescription());
                    }
                    System.out.println("0. 뒤로가기");
                    productInput = scanner.nextInt();
                    if (productInput == 0) {
                        System.out.println("메인으로 돌아갑니다.");
                    } else {
                        Product product = category.getProductList().get(productInput - 1);
                        System.out.println("선택한 상품: " + product.getName() + " | " + product.getPrice() + "원 | " + product.getDescription() + " | 재고: " + product.getStockQuantity());
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("존재하지 않는 번호입니다.");
            } catch (InputMismatchException e) {
                System.out.println("보기의 번호를 입력해주세요.");
                scanner.next();
            }
        }
    }
}
