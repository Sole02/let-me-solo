package projects.commerce;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    private List<Category> categories;
    private Cart cart = new Cart();
    private String adminPassword = "1234";
    private Scanner scanner = new Scanner(System.in);

    public CommerceSystem(List<Category> categories) {
        this.categories = categories;
    }

    public void start() {

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
            System.out.println("6. 관리자 모드");

            if (!cart.isEmpty()) {
                System.out.println("[ 주문 관리 ]");
                System.out.println("4. 장바구니 확인 | 장바구니를 확인 후 주문합니다.");
                System.out.println("5. 주문 취소 | 진행 중인 주문을 취소합니다.");
            }

            try {
                categoryInput = scanner.nextInt();
                if (categoryInput == 0) {
                    System.out.println("커머스 플랫폼을 종료합니다.");
                } else if (categoryInput == 4) {
                    if (cart.isEmpty()) {
                        throw new IllegalStateException("잘못된 입력입니다, 보기의 번호를 입력해 주세요.");
                    }
                    System.out.println("아래와 같이 주문하시겠습니까?");
                    System.out.println("[ 장바구니 내역 ]");
                    for (CartItem cartItem : cart.getCartItems()) {
                        System.out.println(cartItem.getProduct().getName() + " | " + cartItem.getProduct().getPrice() + "원 | " + cartItem.getProduct().getDescription() + " | 수량: " + cartItem.getQuantity() + "개");
                    }
                    System.out.println("[ 총 주문 금액 ]");
                    System.out.println(cart.getTotalPrice() + "원");
                    System.out.println("1. 주문 확정  2. 메인으로 돌아가기");
                    int orderConfirmationInput = scanner.nextInt();
                    if (orderConfirmationInput == 1) {
                        System.out.println("주문이 완료되었습니다! 총 금액: " + cart.getTotalPrice() + "원");
                        for (CartItem cartItem : cart.getCartItems()) {
                            int beforeStock = cartItem.getProduct().getStockQuantity();
                            cartItem.getProduct().reduceStock(cartItem.getQuantity());
                            System.out.println(cartItem.getProduct().getName() + " 재고가 " + beforeStock + "개 → " + cartItem.getProduct().getStockQuantity() + "개로 업데이트되었습니다.");
                        }
                        cart.clearCartItems();
                    } else if (orderConfirmationInput == 2) {
                        System.out.println("메인으로 돌아갑니다.");
                    } else {
                        throw new IllegalArgumentException("잘못된 입력입니다, 보기의 번호를 입력해 주세요.");
                    }
                } else if (categoryInput == 5) {
                    if (cart.isEmpty()) {
                        throw new IllegalStateException("잘못된 입력입니다, 보기의 번호를 입력해 주세요.");
                    }
                    cart.clearCartItems();
                    System.out.println("장바구니를 비웠습니다.");
                } else if (categoryInput == 6) {
                    scanner.nextLine();
                    for (int loginAttempt = 1; loginAttempt <= 3; loginAttempt++) {
                        System.out.print("관리자 비밀번호를 입력해 주세요: ");
                        String inputPassword = scanner.nextLine();
                        if (inputPassword.equals(adminPassword)) {
                            adminMode();
                            break;
                        } else {
                            System.out.println("일치하지 않는 비밀번호입니다.");
                        }
                        if (loginAttempt == 3) {
                            System.out.println("로그인에 실패하였습니다, 메인 메뉴로 돌아갑니다.");
                        }
                    }
                } else {
                    number = 0;
                    Category category = categories.get(categoryInput - 1);
                    System.out.println("[ " + category.getName() + " 카테고리 ]");
                    for (Product product : category.getProductList()) {
                        number++;
                        System.out.print(number + ". 상품 이름: " + product.getName() + " | ");
                        System.out.print("가격: " + product.getPrice() + "원 | ");
                        System.out.println("설명: " + product.getDescription());
                    }
                    System.out.println("0. 뒤로가기");
                    productInput = scanner.nextInt();
                    if (productInput == 0) {
                        System.out.println("메인으로 돌아갑니다.");
                    } else {
                        Product product = category.getProductList().get(productInput - 1);
                        System.out.println("선택한 상품: " + product.getName() + " | " + product.getPrice() + "원 | " + product.getDescription() + " | 재고: " + product.getStockQuantity() + "개");
                        System.out.println("위 상품을 장바구니에 추가하시겠습니까?");
                        System.out.println("1. 확인   2. 취소");
                        int addToCartInput = scanner.nextInt();
                        if (addToCartInput == 1) {
                            if (cart.countProduct(product) < product.getStockQuantity()) {
                                cart.addCartItem(new CartItem(product, 1));
                                System.out.println(product.getName() + " 상품이 장바구니에 추가되었습니다.");
                            } else {
                                throw new IllegalStateException("장바구니에 담을 상품 재고가 부족합니다.");
                            }
                        } else if (addToCartInput == 2) {
                            System.out.println("취소되었습니다.");
                        } else {
                            System.out.println("잘못된 입력입니다, 보기의 번호를 입력해 주세요.");
                        }
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("존재하지 않는 번호입니다.");
            } catch (InputMismatchException e) {
                System.out.println("보기의 번호를 입력해 주세요.");
                scanner.next();
            } catch (IllegalStateException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void adminMode() {

        int adminMenuInput = 1;

        System.out.println("관리자 모드에 접속되었습니다.");
        while (adminMenuInput != 0) {
            System.out.println("[ 관리자 모드 ]");
            System.out.println("1. 상품 추가");
            System.out.println("2. 상품 수정");
            System.out.println("3. 상품 삭제");
            System.out.println("4. 전체 상품 현황");
            System.out.println("0. 메인으로 돌아가기");
            try {
                adminMenuInput = scanner.nextInt();
                if (adminMenuInput == 1) {
                    addProductMenu();
                } else if (adminMenuInput == 2) {
                    editProductMenu();
                } else if (adminMenuInput == 3) {
                    System.out.println("기능 준비중입니다.");
                } else if (adminMenuInput == 4) {
                    System.out.println("기능 준비중입니다.");
                } else if (adminMenuInput == 0) {
                    System.out.println("메인으로 돌아갑니다.");
                    break;
                } else {
                    throw new IllegalArgumentException("잘못된 입력입니다, 보기의 번호를 입력해 주세요.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다, 보기의 번호를 입력해 주세요.");
                scanner.nextLine();
            }
        }
    }

    private void addProductMenu() {

        System.out.println("어느 카테고리에 상품을 추가하시겠습니까?");

        int number = 0;

        for (Category category : categories) {
            number++;
            System.out.println(number + ". " + category.getName());
        }

        int selectCategoryInput = scanner.nextInt();
        scanner.nextLine();

        System.out.println("[ " + categories.get(selectCategoryInput - 1).getName() + " 카테고리에 상품 추가 ]");
        System.out.print("상품명을 입력해 주세요: ");
        String productNameInput = scanner.nextLine();
        System.out.print("가격을 입력해 주세요: ");
        int productPriceInput = scanner.nextInt();
        scanner.nextLine();
        System.out.print("상품 설명을 입력해 주세요: ");
        String productDescriptionInput = scanner.nextLine();
        System.out.print("재고 수량을 입력해 주세요: ");
        int productStockQuantityInput = scanner.nextInt();

        System.out.println(productNameInput + " | " + productPriceInput + "원 | " + productDescriptionInput + " | 재고: " + productStockQuantityInput + "개");
        System.out.println("위 정보로 상품을 추가하시겠습니까?");
        System.out.println("1. 확인  2. 취소");
        int selectWhetherToAdd = scanner.nextInt();
        if (selectWhetherToAdd == 1) {
            Product inputProduct = new Product(productNameInput, productPriceInput, productDescriptionInput, productStockQuantityInput);
            categories.get(selectCategoryInput - 1).addProduct(inputProduct);
            System.out.println("상품이 성공적으로 추가되었습니다.");
        } else if (selectWhetherToAdd == 2) {
            System.out.println("상품 등록을 취소하였습니다.");
        } else {
            System.out.println("잘못된 입력입니다, 보기의 번호를 입력해 주세요.");
        }
    }

    private void editProductMenu() {

        System.out.print("수정할 상품명을 입력해 주세요: ");
        scanner.nextLine();
        String editProductName = scanner.nextLine();
        boolean isThereAProduct = false;

        for (Category category : categories) {
            Product editProduct = category.findProduct(editProductName);
            if (editProduct != null) {
                isThereAProduct = true;
                System.out.println("현재 상품 정보: " + editProduct.getName() + " | " + editProduct.getPrice() + "원 | " + editProduct.getDescription() + " | 재고: " + editProduct.getStockQuantity() + "개");
                System.out.println("수정할 항목을 선택해 주세요.");
                System.out.println("1. 가격");
                System.out.println("2. 설명");
                System.out.println("3. 재고 수량");

                int editSelectionInput = scanner.nextInt();
                if (editSelectionInput == 1) {
                    System.out.println("현재 가격: " + editProduct.getPrice() + "원");
                    System.out.print("변경할 가격을 입력해 주세요: ");
                    int newPrice = scanner.nextInt();

                    int priceBeforeChange = editProduct.getPrice();
                    editProduct.setPrice(newPrice);
                    System.out.println(editProduct.getName() + "의 가격이 " + priceBeforeChange + "원 → " + editProduct.getPrice() + "원으로 수정되었습니다.");
                    break;
                } else if (editSelectionInput == 2) {
                    System.out.println("현재 설명: " + editProduct.getDescription());
                    System.out.print("변경할 설명을 입력해 주세요: ");
                    scanner.nextLine();
                    String newDescription = scanner.nextLine();

                    String descriptionBeforeChange = editProduct.getDescription();
                    editProduct.setDescription(newDescription);
                    System.out.println(editProduct.getName() + "의 상품 설명이 '" + descriptionBeforeChange + "' → '" + editProduct.getDescription() + "'으로 수정되었습니다.");
                    break;
                } else if (editSelectionInput == 3) {
                    System.out.println("현재 재고: " + editProduct.getStockQuantity() + "개");
                    System.out.print("변경할 수량을 입력해 주세요: ");
                    int newStockQuantity = scanner.nextInt();

                    int stockQuantityBeforeChange = editProduct.getStockQuantity();
                    editProduct.setStockQuantity(newStockQuantity);
                    System.out.println(editProduct.getName() + "의 재고가 " + stockQuantityBeforeChange + "개 → " + editProduct.getStockQuantity() + "개로 수정되었습니다.");
                    break;
                } else {
                    throw new IllegalArgumentException("잘못된 입력입니다, 보기의 번호를 입력해 주세요.");
                }
            }
        }
        if (!isThereAProduct) {
            System.out.println("존재하지 않는 상품입니다.");
        }
    }
}
