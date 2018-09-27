package arraylist;


import core.MainLaunch;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/9/26
 */
public class FindMax extends MainLaunch {

    @Override
    public void start() {
        int[] arr = new int[]{4, 63, 1, 78, 3, 2, 88};

        int max = Integer.MIN_VALUE;
        for (int item : arr) {
            if (item > max) {
                max = item;
            }
        }

        System.out.println(String.format("最大的数字是:%d", max));
    }
}
