package structure;

import core.MainLaunch;

/**
 * 描述:移位运算解释示例代码.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2019/7/18
 */
public class OffsetDemo extends MainLaunch {
    @Override
    public void start() {
        // 00000010 -> 00010000 (移位本质解释方式)
        // 2左移3位，相当于2乘以2的3次方 (2*2³=16)
        System.out.println(2 << 3);

        // 00000010 -> 00001000 (移位本质解释方式)
        // 2左移2位，相当于2乘以2的2次方 (2*2²=8)
        System.out.println(2 << 2);

        // 00000011 -> 00011000 (移位本质解释方式)
        // 3左移3位，相当于3乘以2的3次方 (3*2³=24)
        System.out.println(3 << 3);

        // 00001101 -> 00000011 (移位本质解释方式)
        // 13右移2位，相当于13除以2的2次方 (13/2²=3)
        System.out.println(13 >> 2);
    }
}
