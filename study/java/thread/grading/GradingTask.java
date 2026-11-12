package thread.grading;

import java.util.List;

public class GradingTask implements Runnable {

    public String className;
    public List<Integer> scores;
    public int scoreSum = 0;

    public GradingTask(String className, List<Integer> scores) {
        this.className = className;
        this.scores = scores;
    }

    @Override
    public void run() {

        for (int i = 0; i < scores.size(); i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            scoreSum = scores.get(i) + scoreSum;
        }

        System.out.println(className + " 채점 완료 - 합계: " + scoreSum + "점");
    }
}
