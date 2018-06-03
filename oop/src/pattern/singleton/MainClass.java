package pattern.singleton;

import core.MainLaunch;

public class MainClass extends MainLaunch {
    @Override
    public void start() {
        SpUtil spUtil = SpUtil.createSpUtil("staffFile");
        String staffName = spUtil.getStaffName();
        System.out.println(staffName);

        SpUtil spUtil2 = SpUtil.createSpUtil("student");
        String staffName2 = spUtil2.getStaffName();
        System.out.println(staffName2);
    }
}
