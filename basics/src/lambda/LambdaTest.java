package lambda;

import core.MainLaunch;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/10/30
 */
public class LambdaTest extends MainLaunch {

    private List<Interceptor> list;

    @Override
    public void start() {
        add();
        check("你好嗷嗷经济");
    }

    private void add() {
        if (list == null) {
            list = new ArrayList<>();
        }

        list.add(new Interceptor() {
            @Override
            public boolean intercept(String string) {
                if (string.contains("你好"))
                    return true;
                return false;
            }

            @Override
            public void doSomething() {
                System.out.println("你拦截到了 '你好' 关键字");
            }
        });

        list.add(new MyInterceptor());
    }

    private void check(String tag) {
        for (Interceptor interceptor : list) {
            if (interceptor.intercept(tag)) {
                interceptor.doSomething();
                break;
            }
        }
    }

    class MyInterceptor implements Interceptor {

        @Override
        public boolean intercept(String string) {
            if (string.contains("经济"))
                return true;
            return false;
        }

        @Override
        public void doSomething() {
            System.out.println("你拦截到了 '经济' 关键字");
        }
    }


    interface Interceptor {
        boolean intercept(String string);

        void doSomething();
    }
}
