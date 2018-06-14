package pattern.myself;

/**
 * 描述:执行者抽象类.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/6/14
 */
public abstract class AbsExecutor implements IMatchCallBack {
    public abstract void work(String command);

    protected void print(String info) {
        System.out.println(info);
    }
}
