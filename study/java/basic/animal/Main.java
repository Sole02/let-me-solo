package basic.animal;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();

        Cat realCat = (Cat) cat;
        realCat.scratch();

        Dog realDog = (Dog) dog;
        realDog.wag();

        if (cat instanceof Cat) {
            System.out.println("고양이 입니다.");
        } else {
            System.out.println("고양이가 아닙니다.");
        }
    }
}
