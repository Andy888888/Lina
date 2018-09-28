package removeball;

import core.MainLaunch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 描述：待描述
 * <p>
 *
 * @author yanwenqiang
 * @date 2018/9/28
 */
public class MainBall extends MainLaunch {

    private static ArrayList<Ball> ballList;

    // 静态代码块，初始化ballList
    static {
        ballList = new ArrayList<>();
        ballList.add(new RedBall());
        ballList.add(new BlueBall());
        ballList.add(new GreenBall());
    }

    @Override
    public void start() {

        // 进行10轮
        for (int i = 0; i < 10; i++) {
            ArrayList<Ball> balls = new ArrayList<>();
            // 添加5个球
            for (int j = 0; j < 5; j++) {
                addBall(balls);
            }
            // 打印出结果
            printBalls(balls);
        }
    }

    private static Ball getBall() {
        Random random = new Random();
        int index = random.nextInt(3);
        return ballList.get(index);
    }

    private static void printBalls(ArrayList<Ball> balls) {
        for (Ball ball : balls) {
            System.out.print(ball.getColor());
        }

        System.out.print(" --> ");

        for (int i = balls.size() - 1; i > 0; i--) {
            if (balls.size() <= 1) {
                break;
            }
            String colorLast = balls.get(i).getColor();
            String colorFront = balls.get(i - 1).getColor();

            if (colorLast.equals(colorFront)) {
                balls.remove(i);
                balls.remove(i - 1);
                i = balls.size();
            }
        }

        for (Ball ball : balls) {
            System.out.print(ball.getColor());
        }

        System.out.println();
        System.out.println("----------------------");
    }

    private static void addBall(ArrayList<Ball> balls) {
        balls.add(getBall());
    }
}
