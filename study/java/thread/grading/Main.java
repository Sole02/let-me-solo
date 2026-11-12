package thread.grading;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        GradingTask task0 = new GradingTask("1반", List.of(80, 90, 70));
        GradingTask task1 = new GradingTask("2반", List.of(100, 60, 75, 85));
        GradingTask task2 = new GradingTask("3반", List.of(95, 65));

        Thread thread0 = new Thread(task0);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        long startTime = System.currentTimeMillis();

        thread0.start();
        thread1.start();
        thread2.start();

        try {
            thread0.join();
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long endTime = System.currentTimeMillis();
        long allTime = endTime - startTime;

        int averageScore = (task0.scoreSum + task1.scoreSum + task2.scoreSum) / (task0.scores.size() + task1.scores.size() + task2.scores.size());

        System.out.println("학생의 평균 점수: " + averageScore);
        System.out.println("채점 소요 시간: " + allTime + "ms");

    }
}
