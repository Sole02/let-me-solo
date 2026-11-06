package generic.box;

public class Main {

    public static void main(String[] args) {

        GenericBox<String> genericBox = new GenericBox<>("ABC");

        String item = genericBox.item;

        genericBox.printItem("안녕");
        genericBox.printBoxItem(100);

    }
}
