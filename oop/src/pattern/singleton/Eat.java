package pattern.singleton;

import core.MainLaunch;

public class Eat extends MainLaunch {

    public Eat() {
    }

    @Override
    public void start() {
        EatUtil eatUtil = EatUtil.getEatUtil("mhgcghfufu");
        String outStr = eatUtil.getStr();
        System.out.println(outStr);
    }
}
