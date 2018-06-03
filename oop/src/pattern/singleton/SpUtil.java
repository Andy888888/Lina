package pattern.singleton;

public class SpUtil {
    private static SpUtil spUtil;
    private String spName;

    // 修改默认构造函数为私有方法，只允许内部访问
    private SpUtil(String spName) {
        this.spName = spName;
    }

    public static SpUtil createSpUtil(String spName) {
        if (spUtil == null) {
            spUtil = new SpUtil(spName);
        }
        return spUtil;
    }

    public String getStaffName() {
        return spName;
    }


    // ==================类方法 和 实例方法==================
    // 类方法
    public static String trim(String string) {
        return string.trim();
    }
    // 实例方法
    public String trim2(String string) {
        return string.trim();
    }
}
