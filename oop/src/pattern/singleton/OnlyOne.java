package pattern.singleton;

public class OnlyOne {
    private static OnlyOne onlyOne;

    public OnlyOne() {
        return;
    }

    public static OnlyOne create() {
        if (onlyOne == null) {
            onlyOne = new OnlyOne();
        }
        return onlyOne;
    }

    // 代码逻辑有
}