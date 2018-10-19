package thread;

import core.MainLaunch;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/10/19
 */
public class ThreadSafe extends MainLaunch {

    @Override
    public void start() {
        LockTicket ticket = new LockTicket();
//        Ticket ticket = new Ticket();

        //创建三个窗口对象
        Thread t1 = new Thread(ticket, "窗口1");
        Thread t2 = new Thread(ticket, "窗口2");
        Thread t3 = new Thread(ticket, "窗口3");

        //同时卖票
        t1.start();
        t2.start();
        t3.start();
    }
}
