package lapj.examplethread.edu;

/**
 * Created by luispo on 3/8/17.
 */
public class Main {
    public static void main(String[] args) {

        // Threads creation

        Thread thread = new ThreadObject();
        Thread thread1 = new Thread(new ThreadAltObject());



        thread.start();
        thread1.start();
    }
}

