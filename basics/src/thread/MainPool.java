package thread;

import core.MainLaunch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/10/22
 */
public class MainPool extends MainLaunch {

    @Override
    public void start() {
        ExecutorService service = Executors.newFixedThreadPool(3);
        MyRunnable task = new MyRunnable();

        service.submit(task);
        service.submit(task);
        service.submit(task);
        service.submit(task);
        service.submit(task);
        service.submit(task);
        service.submit(task);
        service.submit(task);
        service.submit(task);
        service.submit(task);
        service.submit(task);
        service.submit(task);
        service.submit(task);
        service.submit(task);
    }

    class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "  执行任务");
        }
    }
}
