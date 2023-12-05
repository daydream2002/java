package month12;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wjh
 * @date 2023/12/4 10:23
 */
public class day4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runner runner = new Runner();
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyThread extends Thread {
    static int ticket = 0;
    static Lock lock = new ReentrantLock();

    public void run() {
        while (true) {
            lock.lock();
            try {
                if (ticket == 100)
                    break;
                else {
                    Thread.sleep(10);
                    ticket++;
                    System.out.println(Thread.currentThread().getName() + "@" + ticket);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }

        }
        //lock.unlock();
    }
}

class Runner implements Runnable {
    int ticket = 0;

    private synchronized boolean method() {
        if (ticket == 100)
            return true;
        else {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + "@" + ticket);
        }
        return false;
    }

    @Override
    public void run() {
        while (true)
            if (method())
                break;
    }
}
