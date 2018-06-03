package pattern.factoryna;

import core.MainLaunch;

/**
 * 描述：待描述
 * <p>
 *
 * @author yanwenqiang
 * @date 2018/6/4
 */
public class StaffMain extends MainLaunch {
    @Override
    public void start() {
        StaffFactory staffFactory = new StaffFactory();
        Staff staff = staffFactory.create(StaffFactory.StaffType.IOSDEVELOPER);
        System.out.println(staff.work());
    }
}
