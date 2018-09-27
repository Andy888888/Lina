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
        getParam(command);
        print(String.format("转交%s钥匙", params));
    }

    @Override
    public boolean isMatch(String command) {
        if (command.toLowerCase().contains("turnkey")) {
            return true;
        }
        return false;
    }
}
