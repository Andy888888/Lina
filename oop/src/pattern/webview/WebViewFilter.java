package pattern.webview;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:WebViewFilter.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/10/31
 */
public class WebViewFilter extends AbsWebViewFilter {

    @Override
    protected List<Interceptor> initInterceptors() {
        List<Interceptor> list = new ArrayList<>();

        list.add(new Interceptor() {
            @Override
            public boolean intercept(String string) {
                if (string.contains("savePic"))
                    return true;
                return false;
            }

            @Override
            public void doSomething() {
                System.out.println("保存图片");
            }

            @Override
            public boolean isLoad() {
                return false;
            }
        });

        list.add(new ScanInterceptor());

        return list;
    }
}
