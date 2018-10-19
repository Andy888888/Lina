package thread;

import java.util.List;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/10/19
 */
public class Chihuo extends Thread {
    private List<String> list;

    public Chihuo(String name, List<String> list) {
        super(name);
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            synchronized (list) {
                if (list.size() <= 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("正在吃" + list.get(0) + "...");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("吃完了 " + list.get(0));
                System.out.println();
                list.remove(0);
                list.notify();
            }
        }
    }
}
