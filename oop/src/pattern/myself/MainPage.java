package pattern.myself;

import core.MainLaunch;

import java.util.ArrayList;
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

        String command = "yuancui/QRCodeLogin/token";
//        String command = "yuancui/webview/token";
//        String command = "yuancui/turnKey/token";

        ActivitiesExecutor activitiesExecutor = new ActivitiesExecutor();
        LoginExecutor loginExecutor = new LoginExecutor();
        OperationKeyExecutor operationKeyExecutor = new OperationKeyExecutor();
        WebViewExecutor webViewExecutor = new WebViewExecutor();

        List<AbsExecutor> executorList = new ArrayList<>();
        executorList.add(activitiesExecutor);
        executorList.add(loginExecutor);
        executorList.add(operationKeyExecutor);
        executorList.add(webViewExecutor);

        for (AbsExecutor executor : executorList) {
            if (executor.isMatch(command)) {
                executor.work(command);
                break;
            }
        }
    }
}
