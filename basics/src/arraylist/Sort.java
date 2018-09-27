package arraylist;


import core.MainLaunch;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/9/26
 */
public class Sort extends MainLaunch {
    @Override
    public void start() {
//        int[] intArray = new int[]{1, 6, 2, 8, 3, 4, 7, 5, 9};
        int[] intArray = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
//        error1(intArray);
//        bubbleSort(intArray);
        selectionSort(intArray);
    }

    private void bubbleSort(int[] intArray) {

        // 从前向后(或从后向前)依次比较相邻的元素，若发现逆顺序，则交换。小的向前换，大的向后换，像水底的气泡逐渐向上冒
        // 从前往后比较，将最大的往后面放，后面的逐渐有序

        // 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1
        // 15 + 11 + 10
        // 26 + 10
        // 36 次

        int sum = 0;
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
                sum++;
            }
        }

        for (int item : intArray) {
            System.out.println(item);
        }

        System.out.println(String.format("共计算%d次", sum));
    }

    private void selectionSort(int[] intArray) {

        // 第一次从R[0]~R[n-1]中选取最小值，与R[0]交换。第二次从R[1]~R[n-1]中选取最小值与R[1]交换。。。以此类推

        int sum = 0;

        for (int i = 0; i < intArray.length - 1; i++) {
            // 找到最小的
            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int j = i; j < intArray.length; j++) {
                int item = intArray[j];
                if (item < min) {
                    min = item;
                    index = j;
                }
                sum++;
            }

            int temp = intArray[i];
            intArray[i] = min;
            intArray[index] = temp;
        }

        for (int item : intArray) {
            System.out.println(item);
        }

        System.out.println(String.format("共计算%d次", sum));

        /*
        987654321
        897654321
        879654321
        876954321
        876594321
        876549321
        876543921
        876543291
        876543219
        */

        /*
        876543219
        867543219
        865743219
        865473219
        865437219
        865432719
        865432179
        */

        /*
        865432179
        */

    }

    private void error1(int[] intArray) {

        for (int i = 0; i < intArray.length - 1; i++) {
            int front = intArray[i];
            int last = intArray[i + 1];

            if (last < front) {
                intArray[i] = last;
                intArray[i + 1] = front;
            }
        }

        for (int item : intArray) {
            System.out.println(item);
        }

        /*
        1 6 2 8 3 4 7 5 9   第1位和第2位
        1 6 2 8 3 4 7 5 9   第2位和第3位
        1 2 6 8 3 4 7 5 9   第3位和第4位
        1 2 6 8 3 4 7 5 9   第4位和第5位
        1 2 6 3 8 4 7 5 9   第5位和第6位
        1 2 6 3 4 8 7 5 9   第6位和第7位
        1 2 6 3 4 7 8 5 9   第7位和第8位
        1 2 6 3 4 7 5 8 9   第8位和第9位
        1 2 6 3 4 7 5 8 9   第8位和第9位
         */
    }

}
