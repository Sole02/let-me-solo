package projects.commerce;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    private List<Category> categories;
    private Cart cart = new Cart();

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
                        System.out.println("위 상품을 장바구니에 추가하시겠습니까?");
                        System.out.println("1. 확인   2. 취소");
                        int confirmAddingToCart = scanner.nextInt();
                        if (confirmAddingToCart == 1) {
                            cart.addCartItem(new CartItem(product.getName(), 1, product.getPrice()));
                            System.out.println(product.getName() + " 상품이 장바구니에 추가되었습니다.");
                        } else if (confirmAddingToCart == 2) {
                            System.out.println("취소되었습니다.");
                        } else {
                            System.out.println("잘못된 입력입니다.");
                        }
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
