package pattern.factory;

import core.MainLaunch;

/**
 * 描述：待描述
 * <p>
 *
 * @author yanwenqiang
 * @date 2018/6/4
 */
public class TrafficAnswer extends MainLaunch {
    @Override
    public void start() {
        TrafficFactory factory = new TrafficFactory();
        Traffic traffic = factory.create(TrafficFactory.TrafficType.SUBWAY);
        String anwer = traffic.go();
        System.out.println(anwer);
    }
}
