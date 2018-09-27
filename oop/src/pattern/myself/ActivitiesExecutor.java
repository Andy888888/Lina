package pattern.myself;

/**
 * 描述:节日活动页面执行者.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/6/14
 */
public class ActivitiesExecutor extends AbsExecutor {

    @Override
    public void work(String command) {
        getParam(command);
        print(String.format("有%s节日活动喽", params));
    }

    @Override
    public boolean isMatch(String command) {
        if (command.toLowerCase().contains("activity")) {
            return true;
        }
        return false;
    }


}
