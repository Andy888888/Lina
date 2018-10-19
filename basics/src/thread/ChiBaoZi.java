package thread;

import core.MainLaunch;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/10/19
 */
public class ChiBaoZi extends MainLaunch {
    @Override
    public void start() {
        //等待唤醒案例
        List<String> list = new ArrayList<>();
        // 创建线程对象
        Baozipu bzp = new Baozipu("包子铺", list);
        Chihuo ch = new Chihuo("吃货", list);
        // 开启线程
        bzp.start();
        ch.start();
    }
}
