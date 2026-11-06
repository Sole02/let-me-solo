package basic.animal;

public class Cat extends Animal {

    @Override
    public void exist() {
        System.out.println("고양이");
    }

    @Override
    public void makeSound() {
        System.out.println("야옹");
    }

    public void scratch() {
        System.out.println("스크래치");
    }
}
