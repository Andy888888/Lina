package pattern.template;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/11/22
 */
public class MainActivity extends BaseActivity {
    @Override
    protected void initView() {
        System.out.println("findViewById 从xml布局中寻找并初始化控件");
        System.out.println("初始化控件3个，完毕！");
        System.out.println("==================分割线=================");
    }

    @Override
    protected void appendEvent() {
        System.out.println("给找到的控件添加事件,如OnClick");
        System.out.println("添加一个LongClick，一个Click，完毕！");
        System.out.println("==================分割线=================");
    }
}
