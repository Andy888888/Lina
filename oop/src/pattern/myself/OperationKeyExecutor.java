package pattern.myself;

/**
 * 描述:转交钥匙执行者.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/6/14
 */
public class OperationKeyExecutor extends AbsExecutor {
    @Override
    public void work(String command) {
        print("转交钥匙");
    }

    @Override
    public boolean isMatch(String command) {
        if (command.toLowerCase().contains("turnkey")) {
            return true;
        }
        return false;
    }
}
