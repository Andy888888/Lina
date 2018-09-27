package string;


import core.MainLaunch;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/9/26
 */
public class Reversal extends MainLaunch {
    @Override
    public void start() {
        String tag = "上海自来水来自海上";

        String result = "";
        for (int i = tag.length() - 1; i >= 0; i--) {
            result += tag.substring(i, i + 1);
        }
        System.out.println(result);
    }
}
