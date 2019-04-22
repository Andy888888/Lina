package arithmetic;

import core.MainLaunch;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2019/4/22
 */
public class PrintStar extends MainLaunch {
    @Override
    public void start() {
        printStar(5);
    }

    private void printStar(int row) {

        /// 规律：
        /// 第一行打印1个，第二行打印3个，第三行打印5个
        /// 第一行从第3个位置打，第二行从第2个位置，第三行从第1个位置打
        /// 从中间行星星个数往前往后开始递减，递增、递减单位为2

        int middleIndex = row / 2;
        int maxLineIndex = middleIndex;
        System.out.println("以下是" + row + "行规律的星星");

        int rowCount = 1;
        // 控制行数
        for (int i = 0; i < row; i++) {

            int start = middleIndex;
            int end = start + rowCount;

            // 控制当前行打印
            for (int j = 0; j < row; j++) {
                if (j >= start && j < end) {
                    System.out.print("😄");
                    continue;
                }
                if(j < end){
                    System.out.print("  ");
                    continue;
                }
                break;
            }

            // 换下一行打印
            System.out.println();
            if (i < maxLineIndex) {
                // 开始的位置往前挪一个
                middleIndex--;
                rowCount += 2;
            } else {
                // 开始的位置往后挪一个
                middleIndex++;
                rowCount -= 2;
            }

        }
    }
}
