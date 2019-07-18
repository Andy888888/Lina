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
                System.out.println("包子铺检查包子");
                if (list.size() > 0) {
                    try {
                        System.out.println("包子还有,包子铺先等等");
                        list.wait();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                System.out.println("包子没有了,包子铺开工");

                list.add("包子" + count++);
                System.out.println("给你 " + list.get(0));
                list.notify();
            }
        }
    }
}
