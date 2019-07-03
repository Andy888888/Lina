package arraylist;

import core.MainLaunch;

import java.util.ArrayList;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/9/26
 */
public class RemoveIf extends MainLaunch {

    @Override
    public void start() {
        ArrayList<String> dataList = new ArrayList();
        dataList.add("吃饭要讲究营养");
        dataList.add("萝卜");
        dataList.add("是兔子喜欢吃的");
        dataList.add("白菜");
        dataList.add("也是兔子喜欢吃的");
        dataList.add("人类是不一样的");
        dataList.add("各有所爱");

//        for (int i = dataList.size() - 1; i >= 0; i--) {
//            if (dataList.get(i).length() > 5) {
//                dataList.remove(i);
//            }
//        }

        dataList.removeIf(q -> q.length() > 5);

        for (String item : dataList) {
            System.out.println(item);
        }
    }
}
