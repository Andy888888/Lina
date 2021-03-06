package removeball;

import core.MainLaunch;

import java.util.ArrayList;
import java.util.Random;

/**
 * 描述：待描述
 * <p>
 *
 * @author yanwenqiang
 * @date 2018/9/28
 */
public class MainBall extends MainLaunch implements BallColor {

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

            boolean equals = BallColor.equalsColor(balls.get(i), balls.get(i - 1));
            if (equals) {
                balls.remove(i);
                balls.remove(i - 1);
                // 消除后，再重新开始一轮检查。如果没有这一步，将会出现这样的结果：
                // 红蓝红蓝蓝红 --> 红蓝红红 --> 红蓝红红
                // 加上下面代码后才是正确结果：红蓝红蓝蓝红 --> 红蓝红红 --> 红蓝
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
