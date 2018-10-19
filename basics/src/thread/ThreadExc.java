package thread;

import core.MainLaunch;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/10/19
 */
public class ThreadExc extends MainLaunch {

    @Override
    public void start() {
        new MyThread("老高").start();
        for (int i = 0; i < 20; i++) {
            System.out.println("那你/");
        }
    }

    class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            super.run();
            for (int i = 0; i < 20; i++) {
                System.out.println(getName() + "/");
            }
        }
    }
}
