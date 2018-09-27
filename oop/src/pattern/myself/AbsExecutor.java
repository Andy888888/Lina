package pattern.myself;

/**
 * 描述:执行者抽象类.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/6/14
 */
public abstract class AbsExecutor implements IMatchCallBack {
    protected String actionName;
    protected String params;

    public abstract void work(String command);

    protected void print(String info) {
        System.out.println(info);
    }

    protected void getParam(String command) {
        String[] urlArray = command.split("/");
        actionName = urlArray[1];
        params = urlArray[2];
    }
}
