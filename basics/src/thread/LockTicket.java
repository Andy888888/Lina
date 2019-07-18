package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 描述:线程里的安全锁,达到串行.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/10/19
 */
public class LockTicket implements Runnable {
    private int ticket = 100;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在卖:" + ticket--);
            }
            lock.unlock();
        }

    }
}


