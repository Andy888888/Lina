package integer;

import core.MainLaunch;

import java.util.ArrayList;
import java.util.Collections;
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
        System.out.println(convert2(255));
        System.out.println(convert10("11111111"));
    }

    private String convert2(int number) {
        if (number <= 0) {
            return "0";
        }
        List<Integer> list = new ArrayList<>();
        int curNumber = 1;
        list.add(curNumber);

        while (curNumber < number) {
            curNumber = curNumber << 1;
            list.add(curNumber);
        }

        int plus = 0;
        Collections.reverse(list);
        StringBuilder resb = new StringBuilder();
        for (Integer integer : list) {
            boolean isPlus = tryPlus(plus, integer, number);
            if (isPlus) {
                resb.append('1');
                plus += integer;
                continue;
            }
            resb.append('0');
        }

        int index = resb.indexOf("1");
        String result = resb.substring(index, resb.length());

        return result;

    }

    private String convert10(String number) {
        int length = number.length();
        int[] sequence = sequence(length);

        int plus = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (number.substring(i, i + 1).equals("1")) {
                plus += sequence[i];
            }
        }
        return String.valueOf(plus);
    }

    private boolean tryPlus(int a, int b, int tag) {
        int c = a + b;
        if (c <= tag) {
            return true;
        }
        return false;
    }

    private int[] sequence(int length) {
        int[] sequence;
        if (length <= 0) {
            return null;
        }

        sequence = new int[length];
        sequence[0] = 1;
        if (length == 1) {
            return sequence;
        }

        for (int i = 1; i < length; i++) {
            sequence[i] = sequence[i - 1] << 1;
        }
        return sequence;
    }
}
