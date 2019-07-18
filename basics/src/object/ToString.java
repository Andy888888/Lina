package object;

import core.MainLaunch;

import java.util.LinkedList;

/**
 * 描述:ToString的使用.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/10/12
 */
public class ToString extends MainLaunch {

    private String name = "张三";
    private float age = -0.8f;

    public ToString() {


    }

    public ToString(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public void start() {
////        System.out.print("CC " + this);
//
//        Linked<String> resultList = new Linked<>();
//        String[] arr = {"a","b","a"};
//        for (int i = 0; i < arr.length; i++) {
//            if(!resultList.contains(arr[i])){
//                resultList.add(arr[i]);
//            }
//        }
//    }

//    @Override
//    public String toString() {
//        System.out.print("AA ");
//        return "ToString Class Instance.";
//    }


    @Override
    public void start() {

//        Linked<String> resultList = new Linked<>();
//        String[] arr = {"a", "b", "a"};
//        for (int i = 0; i < arr.length; i++) {
//            if (!resultList.contains(arr[i])) {
//                resultList.add(arr[i]);
//            }
//        }
//
//        for (String s : resultList) {
//            System.out.print(s + "  ");
//        }


        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
        LinkedList<String> linkList = new LinkedList<String>();

        for (int i = 0; i < strs.length; i++) {
            linkList.add(strs[i]);
        }

        System.out.println(linkList);

        for (int i = linkList.size() - 1; i >= 0; i--) {
            String s =  linkList.get(i);
            linkList.remove(s);
            if(!linkList.contains(s)){
                linkList.add(s);
            }
        }


        for (String s : linkList) {
            System.out.print(s + "  ");
        }


//        String str = linkList.get(0);
//        for (int i = 0; i < linkList.size(); i++) {
//            if (str == linkList.get(i)) {
//                linkList.remove();
//            }
//            System.out.println(linkList.get(i));
//        }

    }
}
