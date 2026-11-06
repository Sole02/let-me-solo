package basic.remote2;

public class RemoteControl implements Pc, Tv {

    @Override
    public void on() {
        System.out.println("전원 켜기");
    }

    @Override
    public void off() {
        System.out.println("전원 끄기");
    }

    void restart() {
        System.out.println("재시작");
    }
}
