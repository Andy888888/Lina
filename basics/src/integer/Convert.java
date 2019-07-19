package integer;

import core.MainLaunch;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:二进制与十进制相互转换.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2019/7/19
 */
public class Convert extends MainLaunch {

    @Override
    public void start() {
        convert2(30);
    }

    private String convert2(int number) {
        if (number <= 0) {
            return "0";
        }
        List<Integer> list = new ArrayList<>();
        int curNumber = 1;
        list.add(curNumber);

        while (curNumber < number) {
            curNumber = curNumber * 2;
            list.add(curNumber);
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }


        return "";

    }

    private String convert10(String number) {
        return "";
    }
}
