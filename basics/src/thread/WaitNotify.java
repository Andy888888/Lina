package thread;

import core.MainLaunch;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/10/19
 */
public class WaitNotify extends MainLaunch {

    String lock = "s";

    @Override
    public void start() {
        // 步骤1 : 子线程开启,进入无限等待状态, 没有被唤醒,无法继续运行.
        new Thread(() -> {
            try {
                System.out.println("begin wait ....");
                synchronized (lock) {
                    lock.wait();
                }
                System.out.println("over");
            } catch (Exception e) {
            }
        }).start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (lock) {
            System.out.println("唤醒");
            lock.notify();
        }

//        new Thread(() -> {
//            try {
//                synchronized (lock) {
//                    System.out.println("唤醒");
//                    lock.notify();
//                }
//            } catch (Exception e) {
//            }
//        }).start();
    }
}
