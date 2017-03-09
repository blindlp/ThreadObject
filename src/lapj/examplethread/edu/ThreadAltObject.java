package lapj.examplethread.edu;

/** Thread 2 implementation
 * Created by luispo on 3/8/17.
 */
public class ThreadAltObject implements Runnable
{
    @Override
    public void run() {
        System.out.println("Hello from thread 2");
    }
}
