package generic.box;

public class GenericBox<T> {

    public T item;

    public GenericBox(T item) {
        this.item = item;
    }

    public T GenericBox() {
        return this.item;
    }

    public void printItem(T item) {
        System.out.println(item);
    }

    public <S> void printBoxItem(S item) {
        System.out.println(item);
    }
}
