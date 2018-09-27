package arraylist;


import core.MainLaunch;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 描述:登录.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/9/26
 */
public class Login extends MainLaunch {

    @Override
    public void start() {
        // 创建用户数据
        ArrayList<User> userDataList = new ArrayList();
        userDataList.add(new User("zhangsan", "zzz"));
        userDataList.add(new User("lisi", "lll"));
        userDataList.add(new User("wangwu", "www"));
        userDataList.add(new User("zhangsan", "mmm"));

        // 提示用户输入信息，并获取输入信息
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("请输入用户名:");
        String inName = inputScanner.nextLine();
        System.out.print("请输入密码:");
        String inPassword = inputScanner.nextLine();

        // 初始化 [姓名匹配] 和 [密码匹配] 变量
        boolean userNameMatch = false;
        boolean userPasswordMatch = false;

        // 循环每一个用户信息
        for (User user : userDataList) {
            if (!user.getName().equals(inName)) {
                // 如果输入的用户名和当前用户名不一致，没有必要再去检验密码了，直接continue，进入下一次循环
                continue;
            }
            // 程序能执行到这里，说明本次循环到的用户名和输入的用户名一致，标识userNameMatch为真
            userNameMatch = true;

            if (!user.getPassword().equals(inPassword)) {
                // 如果输入的用户密码和当前用户密码不一致，直接continue，进入下一次循环
                continue;
            }
            // 程序能执行到这里，说明用户名和密码都验证通过，那么后面的数据没有必要检验了，直接打断循环
            userPasswordMatch = true;
            break;
        }

        // 如果连用户名都没有匹配，说明没有这个用户
        if (!userNameMatch) {
            System.out.println("没有该用户！");
            return;
        }
        // 如果只是用户密码没有匹配，说明有用户名，没有密码
        if (!userPasswordMatch) {
            System.out.println("密码有误！");
            return;
        }

        System.out.println("登录成功！");
    }
}
