package thread.sum;

public class Main {

    public static void main(String[] args) {

        // 싱글 쓰레드 구현

        long singleThreadStartTime = System.currentTimeMillis();
        System.out.println("싱글 쓰레드 시작 시간: " + singleThreadStartTime);

        long singleSum = SingleTask.calculateSum();

        long singleThreadEndTime = System.currentTimeMillis();
        System.out.println("싱글 쓰레드 종료 시간: " + singleThreadEndTime);

        long singleThreadDuration = singleThreadEndTime - singleThreadStartTime;
        System.out.println("싱글 쓰레드 사용 시간: " + singleThreadDuration + "ms");
        System.out.println("싱글 쓰레드 총합: " + singleSum);


        // 멀티 쓰레드 구현

        MultiTask task0 = new MultiTask(1, 250);
        MultiTask task1 = new MultiTask(251, 500);
        MultiTask task2 = new MultiTask(501, 750);
        MultiTask task3 = new MultiTask(751, 1000);

        Thread thread0 = new Thread(task0);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        long multiThreadStartTime = System.currentTimeMillis();
        System.out.println("멀티 쓰레드 시작 시간: " + multiThreadStartTime);

        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread0.join();
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long multiThreadEndTime = System.currentTimeMillis();
        System.out.println("멀티 쓰레드 종료 시간: " + multiThreadEndTime);

        long multiThreadDuration = multiThreadEndTime - multiThreadStartTime;
        System.out.println("멀티 쓰레드 사용 시간: " + multiThreadDuration + "ms");

        long multiSum = task0.partialSum + task1.partialSum + task2.partialSum + task3.partialSum;
        System.out.println("멀티 쓰레드 총합: " + multiSum);

    }
}
