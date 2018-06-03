package pattern.factory;

/**
 * 描述：公交
 * <p>
 *
 * @author yanwenqiang
 * @date 2018/6/4
 */
public class Bus extends Traffic  {
    @Override
    public String go() {
        return "请到立水桥南公交站牌";
    }
}
