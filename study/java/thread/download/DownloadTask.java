package thread.download;

public class DownloadTask implements Runnable {

    public String fileName;
    public int timeRequired;

    public DownloadTask(String fileName, int timeRequired) {
        this.fileName = fileName;
        this.timeRequired = timeRequired;
    }

    @Override
    public void run() {

        long timeRequiredMillis = timeRequired * 1000;

        System.out.println(fileName + " 다운로드 시작");

        try {
            Thread.sleep(timeRequiredMillis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(fileName + " 다운로드 완료");

    }
}
