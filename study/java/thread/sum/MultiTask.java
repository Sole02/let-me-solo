package thread.sum;

public class MultiTask implements Runnable {

    public int start;
    public int end;
    public long partialSum;

    public MultiTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            partialSum += i;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
