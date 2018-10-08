package removeball;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/9/29
 */
public interface BallColor {
    static boolean equalsColor(Ball b1, Ball b2) {
        return b1.getColor().equals(b2.getColor());
    }
}
