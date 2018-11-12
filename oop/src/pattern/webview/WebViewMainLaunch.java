package pattern.webview;

import core.MainLaunch;

/**
 * 描述:WebViewFilter Demo.
 * <p>
 *
 * 输入一个字符串，拦截字符串并做处理。例如：包含“savePic”就打印“保存图片”；
 * 包含“scan”就打印“扫描二维码”... 要保证代码灵活性，可维护性，可拓展性。
 *
 * @author yanwenqiang.
 * @date 2018/10/31
 */
public class WebViewMainLaunch extends MainLaunch {
    @Override
    public void start() {
        load();
    }

    private void load() {
        WebViewFilter filter = new WebViewFilter();
        boolean isLoad = filter.check("http://www.baidu.com/params:{'action':'scan'}");
//        boolean isLoad = filter.check("http://www.baidu.com/params:{'action':'savePic'}");
        if (isLoad) {
            System.out.println("继续加载");
        } else {
            System.out.println("停止加载");
        }
    }
}
