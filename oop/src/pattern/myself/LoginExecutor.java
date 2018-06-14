package pattern.myself;

/**
 * 描述:登录的执行者.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/6/14
 */
public class LoginExecutor extends AbsExecutor {

    @Override
    public void work(String command) {
        print("扫描二维码登录");
    }

    @Override
    public boolean isMatch(String command) {
        if (command.toLowerCase().contains("login")) {
            return true;
        }
        return false;
    }
}
