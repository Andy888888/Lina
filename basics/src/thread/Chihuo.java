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
                System.out.println("吃货检查有没有包子");
                if (list.size() <= 0) {
                    try {
                        System.out.println("没包子了，吃货等包子");
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("有包子了，正在吃" + list.get(0) + "...");

                try {
                    Thread.sleep(5000);
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
