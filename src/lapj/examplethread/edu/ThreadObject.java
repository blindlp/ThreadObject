package lapj.examplethread.edu;

/** Thread 1 Implementation
 * Created by luispo on 3/8/17.
 */
public class ThreadObject extends Thread {

    @Override
    public void run() {
        System.out.println("Hellp from thead 1");
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Thread 1 has been interrupted");
                Thread.currentThread().interrupt();
            }
            System.out.println("Count from thread 1 - " + i);
        }
    }
}
