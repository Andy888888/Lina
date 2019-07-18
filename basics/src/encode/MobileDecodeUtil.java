package encode;

import core.MainLaunch;

import java.util.List;

/**
 * 描述:手机号码解码工具.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2019/5/22
 */
public class MobileDecodeUtil extends MainLaunch {

    // G4F -- 0
    // Z6G -- 1
    // 5M4 -- 2
    // 6T5 -- 3
    // W60 -- 4
    // Z9I -- 5
    // C78 -- 6
    // H0J -- 7
    // D87 -- 8
    // U1V -- 9
    private final String symbols = "G4F,Z6G,5M4,6T5,W60,Z9I,C78,H0J,D87,U1V";

    @Override
    public void start() {
        String mobile = decodeMobile("Z6GZ9IC78U1VU1VD87D87D87C78Z9IC78");
        System.out.println(mobile);
    }

    private boolean isNullOrEmpty(String value) {
        if (value == null) {
            return true;
        }
        if (value.length() <= 0) {
            return true;
        }
        return false;
    }

    private String decodeMobile(String mobile) {

        String resultMobile = "";
        if (isNullOrEmpty(mobile)) {
            return mobile;
        }

        int length = mobile.length();
        if (length != 33) {
            return mobile;
        }

        String[] symbolArr = symbols.split(",");
        int encoderLength = symbolArr.length;

        for (int i = 0; i < length; i = i + 3) {
            String number = mobile.substring(i, i + 3);

            for (int j = 0; j < encoderLength; j++) {
                if (symbolArr[j].equals(number)) {
                    resultMobile += j;
                    break;
                }
            }
        }

        return resultMobile;
    }
}
