package pattern.singleton;

import core.MainLaunch;

public class TTTT extends MainLaunch {

    // 2
    public TTTT(){
        String m = "";
    }

    // 静态代码块  1
    static {
        String n = "";
        if(n.equals("122")){

        }
    }

    public static String aa = "";

    @Override
    public void start() {

        OnlyOne ss = new OnlyOne();

//        OnlyOne onlyOne = OnlyOne.create();
//
//        OnlyOne onlyOne1 = OnlyOne.create();
//
//        OnlyOne onlyOne2 = OnlyOne.create();
//
//        OnlyOne onlyOne3 = OnlyOne.create();
    }
}
