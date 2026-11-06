package basic.remote;

public class Main {

    public static void main(String[] args) {
        Pc pc = new Pc();
        Tv tv = new Tv();

        pc.on();
        pc.off();

        tv.on();
        tv.off();

        pc.restart();


    }
}
