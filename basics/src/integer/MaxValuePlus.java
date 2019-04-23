package integer;

import core.MainLaunch;

/**
 * 描述：待描述
 * <p>
 *
 * @author yanwenqiang
 * @date 2019/4/21
 */
public class MaxValuePlus extends MainLaunch {
    public String plus(int a, int b) {
        String number1 = String.valueOf(a);
        String number2 = String.valueOf(b);

        int length1 = number1.length();
        int length2 = number2.length();

        int loopCount = length1 > length2 ? length1 : length2;

        StringBuilder result = new StringBuilder();
        int temp = 0;
        for (int i = 0; i < loopCount; i++) {
            int start1 = length1 - 1 - i;
            int end1 = length1 - i;
            int start2 = length2 - 1 - i;
            int end2 = length2 - i;

            int item1 = 0;
            int item2 = 0;
            if (start1 >= 0) {
                item1 = Integer.valueOf(number1.substring(start1, end1));
            }
            if (start2 >= 0) {
                item2 = Integer.valueOf(number2.substring(start2, end2));
            }

            int plusResult = item1 + item2 + temp;
            int outputResult;
            if (i != loopCount - 1) {
                outputResult = plusResult >= 10 ? plusResult - 10 : plusResult;
            } else {
                outputResult = plusResult;
            }
            result.insert(0, outputResult);
            temp = plusResult / 10;
        }

        return result.toString();

    }

    @Override
    public void start() {
        // Integer.MAX_VALUE = 2147483647
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        System.out.println("计算结果：" + plus(a, b));

        long n = a;
        long m = b;
        System.out.println("正确结果：" + (n + m));
    }
}
