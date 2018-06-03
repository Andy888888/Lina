package pattern.factoryna;

/**
 * 描述：待描述
 * <p>
 *
 * @author yanwenqiang
 * @date 2018/6/4
 */
public class StaffFactory {
    public Staff create(StaffType type) {
        Staff staff = null;
        switch (type) {
            case UIDEVELOPER:
                staff = new Ui();
                break;
            case IOSDEVELOPER:
                staff = new Ios();
                break;
            case ANDROIDDEVELOPER:
                staff = new Android();
                break;
            default:
                System.out.println("我错了！！！");
                break;
        }
        return staff;
    }

    public enum StaffType {
        UIDEVELOPER,
        IOSDEVELOPER,
        ANDROIDDEVELOPER
    }
}
