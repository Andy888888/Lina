package pattern.factory;
/**
 * 描述：地铁
 * <p>
 * @author yanwenqiang
 * @date 2018-06-05
 */
public class Subway extends Traffic {
    @Override
    public String go() {
        return "请走13号线，换乘2号线";
    }
}
