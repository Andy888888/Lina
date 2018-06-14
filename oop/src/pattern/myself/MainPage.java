package pattern.myself;

import core.MainLaunch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 描述:调用主页面.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/6/14
 */
public class MainPage extends MainLaunch {
    @Override
    public void start() {

//        String command = "yuancui/QRCodeLogin/token";
//        String command = "yuancui/webview/token";
//        String command = "yuancui/turnKey/token";
        String command = "yuancui/activity/token";

        // 这种实例化方式，List的长度是固定的，不能再add新的项目
        List<AbsExecutor> executorList = Arrays.asList(
                new ActivitiesExecutor(),
                new LoginExecutor(),
                new OperationKeyExecutor(),
                new WebViewExecutor());

        for (AbsExecutor executor : executorList) {
            if (executor.isMatch(command)) {
                executor.work(command);
                break;
            }
        }
    }
}
