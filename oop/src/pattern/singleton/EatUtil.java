package pattern.singleton;

public class EatUtil {
    private String str;
    private static EatUtil eatUtil;

    public static EatUtil getEatUtil(String str) {
        if (eatUtil == null) {
            eatUtil = new EatUtil();
            eatUtil.setStr(str);
        }
        return eatUtil;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
