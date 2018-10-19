package string;

import core.MainLaunch;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/10/19
 */
public class StringMemory extends MainLaunch {
    @Override
    public void start() {
        // 共有三个引用地址指向
        String a = "sda goods";
        String b = a + "c";

        System.out.println(b.hashCode());
        System.out.println(a.hashCode());
    }
}
