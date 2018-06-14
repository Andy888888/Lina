package pattern.myself;

/**
 * 描述:打开网页的执行者.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/6/14
 */
public class WebViewExecutor extends AbsExecutor {
    @Override
    public void work(String command) {
        print("正常加载网页");
    }

    @Override
    public boolean isMatch(String command) {
        if (command.toLowerCase().contains("webview")) {
            return true;
        }
        return false;
    }
}
