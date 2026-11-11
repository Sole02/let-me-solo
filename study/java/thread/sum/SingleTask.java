package thread.sum;

public class SingleTask {

    public static long calculateSum() {
        long sum = 0;

        for (int i = 1; i <= 1000; i++) {
            try {
                Thread.sleep(10);
                sum += i;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return sum;
    }

}
