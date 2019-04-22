package pattern.template;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/11/22
 */
public abstract class BaseActivity {
    public void onCreate(){
        System.out.println("设置主题和导航栏");
        initView();
        appendEvent();
    }

    protected abstract void initView();
    protected abstract void appendEvent();
}
