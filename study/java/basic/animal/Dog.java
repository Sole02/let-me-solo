package basic.animal;

public class Dog extends Animal {

    @Override
    public void exist() {
        System.out.println("강아지");
    }

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    public void wag() {
        System.out.println("꼬리 흔들기");
    }
}
