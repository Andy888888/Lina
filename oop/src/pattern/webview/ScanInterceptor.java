package pattern.webview;

/**
 * 描述:扫描二维码拦截器.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/10/31
 */
public class ScanInterceptor implements AbsWebViewFilter.Interceptor {
    @Override
    public boolean intercept(String string) {
        if (string.contains("scan"))
            return true;
        return false;
    }

    @Override
    public void doSomething() {
        System.out.println("扫描二维码");
    }

    @Override
    public boolean isLoad() {
        return true;
    }
}
