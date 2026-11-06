package basic.remote;

public class Pc implements RemoteControl{

    @Override
    public void on() {
        System.out.println("전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("전원을 끕니다.");
    }

    public void restart() {
        System.out.println("다시 시작합니다.");
    }
}
