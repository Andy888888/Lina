package thread;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/10/19
 */
public class Ticket implements Runnable {
    private int ticket = 100;

    Object lock = new Object();

//    /*
//     * 执行卖票操作
//     */
//    @Override
//    public void run() { //每个窗口卖票的操作 //窗口
//        // 同步代码，互斥
//        synchronized (lock) {
//            // 永远开启
//            while (ticket > 0) {
//
//                //有票 可以卖 //出票操作使用sleep模拟一下出票时间
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                //获取当前线程对象的名字
//                String name = Thread.currentThread().getName();
//                System.out.println(name + "正在卖:" + ticket--);
//
//            }
//        }
//    }


    @Override
    public synchronized void run() {
        // 同步代码，互斥
        while (ticket > 0) {
            //有票 可以卖 //出票操作使用sleep模拟一下出票时间
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //获取当前线程对象的名字
            String name = Thread.currentThread().getName();
            System.out.println(name + "正在卖:" + ticket--);

        }
    }
}
