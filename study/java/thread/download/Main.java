package thread.download;

public class Main {

    public static void main(String[] args) {

        long downloadStart = 0;
        long downloadEnd = 0;
        long allDownloadTime = 0;

        // 싱글 쓰레드 구현

        DownloadTask task0 = new DownloadTask("photo.jpg", 1);
        DownloadTask task1 = new DownloadTask("music.mp3", 2);
        DownloadTask task2 = new DownloadTask("video.mp4", 3);

        downloadStart = System.currentTimeMillis();

        task0.run();
        task1.run();
        task2.run();

        downloadEnd = System.currentTimeMillis();
        allDownloadTime = downloadEnd - downloadStart;

        System.out.println("전체 다운로드 완료 시간: " + allDownloadTime + "ms");


        // 멀티 쓰레드 구현

        Thread thread0 = new Thread(task0);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        downloadStart = System.currentTimeMillis();

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
        downloadEnd = System.currentTimeMillis();
        allDownloadTime = downloadEnd - downloadStart;

        System.out.println("전체 다운로드 완료 시간: " + allDownloadTime + "ms");

    }

}
