package pattern.factory;

/**
 * 描述：出租车
 * <p>
 *
 * @author yanwenqiang
 * @date 2018/6/4
 */
public class Taxi extends Traffic {
    @Override
    public String go() {
        return "请打开滴滴，输入目标三元桥";
    }
}
