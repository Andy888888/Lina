package pattern.factory;

/**
 * 描述：交通工具工厂
 * <p>
 *
 * @author yanwenqiang
 * @date 2018/6/4
 */
public class TrafficFactory {
    public Traffic create(TrafficType type) {
        Traffic traffic = null;
        // 根据传入的不同参数，来生产具体的Class
        switch (type) {
            case BUS:
                traffic = new Bus();
                break;
            case TAXI:
                traffic = new Taxi();
                break;
            case SUBWAY:
                traffic = new Subway();
                break;
            default:
                System.out.println("交通工具不存在");
                break;
        }
        return traffic;
    }

    public enum TrafficType {
        SUBWAY,
        TAXI,
        BUS
    }
}
