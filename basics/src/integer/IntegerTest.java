package integer;

import core.MainLaunch;

/**
 * 描述：待描述
 * <p>
 *
 * @author yanwenqiang
 * @date 2019/3/24
 */
public class IntegerTest extends MainLaunch {
    @Override
    public void start() {
//        Integer a = new Integer(3);
//        Integer b = new Integer(3);
//        Integer c = 3;
//        int d = 3;
//
//        System.out.println(a == b);
//        System.out.println(b == c);
//        System.out.println(c == d);


//        Integer m = 128;
//        Integer n = 128;
//        System.out.println(m == n);
//
//        Integer x = 127;
//        Integer y = 127;
//        System.out.println(x == y);

        try {
            throw new Exception("s");
        } catch (ExceptionA e) {
            System.out.println("ExampleA");
        } catch (Exception e) {
            System.out.println("Example");
        }

    }
}


class ExceptionA extends Exception {

}

class ExceptionB extends ExceptionA {

}
