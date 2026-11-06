package basic;

public class TrafficLight {
    public static void main(String[] args) {

        String light = "파란불";

        if (light.equals("초록불")) {
            System.out.println("건너세요");

        } else if (light.equals("노란불")) {
            System.out.println("주의하세요");

        } else if (light.equals("빨간불")) {
            System.out.println("멈추세요");

        } else {
            System.out.println("잘못된 입력입니다");
        }
    }



    // 예상 출력:
//    신호등 색상을 입력하세요 (초록불, 노란불, 빨간불): 초록불
//    건너세요!
//    신호등 색상을 입력하세요 (초록불, 노란불, 빨간불): 노란불
//    주의하세요!
//    신호등 색상을 입력하세요 (초록불, 노란불, 빨간불): 빨간불
//    멈추세요!
//    신호등 색상을 입력하세요 (초록불, 노란불, 빨간불): 파란불
//    잘못된 입력입니다.
}
