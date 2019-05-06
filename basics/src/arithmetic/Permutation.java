package arithmetic;

import core.MainLaunch;

import java.util.*;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2019/4/25
 */
public class Permutation extends MainLaunch {
    @Override
    public void start() {
//        permutation1("abcd", "", 4);
//        permutation("abcd");
        method("hello####word##ni#hao#");
//        method();
    }

    private void method() {
        int[] arr1 = new int[]{9, 5, 7};
        int[] arr2 = new int[]{3, 2, 8};

        List<Integer> integers = new ArrayList<>();
        for (int i : arr1) {
            integers.add(i);
        }
        for (int i : arr2) {
            integers.add(i);
        }
        integers.sort(Comparator.comparingInt(o -> o));

        System.out.println(integers);
    }

    private void method(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);

        for (int i = word.length() - 1; i > 0; i--) {
            String a = word.substring(i - 1, i);
            String b = word.substring(i, i + 1);

            if (a.equals(b) && a.equals("#")) {
                stringBuilder.replace(i, i + 1, "");
            }
        }

        System.out.println(stringBuilder.toString());
    }

    private void permutation(String string) {
        int length = string.length();
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {

            }
        }

    }

    public static void permutation1(String str, String result, int len) {
        if (result.length() == len) {            //表示遍历完了一个全排列结果
            System.out.println(result);
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (result.indexOf(str.charAt(i)) < 0) {    //返回指定字符在此字符串中第一次出现处的索引。
                    //System.out.println("字母："+str.charAt(i));
                    permutation1(str, result + str.charAt(i), len);
                }
            }
        }
    }
}
