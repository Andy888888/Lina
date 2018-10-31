package pattern.webview;

import java.util.List;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/10/30
 */
public abstract class AbsWebViewFilter {

    private List<Interceptor> interceptors;

    public AbsWebViewFilter() {
        interceptors = initInterceptors();
    }

    protected abstract List<Interceptor> initInterceptors();

    protected void onCheck(Interceptor interceptor) {
        interceptor.doSomething();
    }

    public boolean check(String tag) {
        for (Interceptor interceptor : interceptors) {
            if (interceptor.intercept(tag)) {
                onCheck(interceptor);
                return interceptor.isLoad();
            }
        }

        return false;
    }

    interface Interceptor {
        boolean intercept(String string);

        void doSomething();

        boolean isLoad();
    }
}
