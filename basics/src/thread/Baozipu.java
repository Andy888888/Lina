package thread;

import java.util.List;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/10/19
 */
public class Baozipu extends Thread {

    private List<String> list;

    public Baozipu(String name, List<String> list) {
        super(name);
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        int count = 0;
        while (true) {
            synchronized (list) {
                if (list.size() > 0) {
                    try {
                        list.wait();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                list.add("包子" + count++);
                System.out.println("给你 " + list.get(0));
                list.notify();
            }
        }
    }
}
