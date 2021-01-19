package knowingtheplatform.workingwithexceptions;

import java.util.concurrent.TimeUnit;

public class MyThread extends Thread{

    public MyThread() {
        super();
        System.out.println("\nAn instance of the " + MyThread.class + " class was created!");
    }

    @Override
    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException interruptedException) {
            System.out.println("Catch a InterruptedException: " + interruptedException.getClass());
        }

    }

}
