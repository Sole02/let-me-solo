package lambda;

@FunctionalInterface
public interface Checker {

    boolean check(int c);

    default boolean isNot(int c) {
        return !check(c);
    }
}
