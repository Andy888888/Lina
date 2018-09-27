package pattern.myself;

import core.MainLaunch;

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
        String command = "yuancui/webview/www.baidu.com/";
//        String command = "yuancui/turnKey/5号楼3单元0602室";
//        String command = "yuancui/activity/国庆";

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
