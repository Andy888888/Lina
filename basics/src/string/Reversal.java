package string;


import core.MainLaunch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 描述:反转.
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

        reverseCollection();
    }

    private void reverseCollection(){
        String tag = "萝卜白菜各有所爱";

        List<String> tagList = new ArrayList<>();
        for (int i = 0; i < tag.length(); i++) {
            tagList.add(tag.substring(i, i + 1));
        }

        Collections.reverse(tagList);
        for (String s : tagList) {
            System.out.print(s);
        }

        System.out.println();
    }
}
