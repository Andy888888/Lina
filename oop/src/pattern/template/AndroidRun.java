package pattern.template;

import core.MainLaunch;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/11/22
 */
public class AndroidRun extends MainLaunch {
    @Override
    public void start() {

        BaseActivity mainActivity = new MainActivity();
        mainActivity.onCreate();

        System.out.println();
        System.out.println();

        BaseActivity detailActivity = new DetailActivity();
        detailActivity.onCreate();

    }
}
