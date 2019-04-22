package string;

import core.MainLaunch;

/**
 * 描述：待描述
 * <p>
 *
 * @author yanwenqiang
 * @date 2019/3/24
 */
public class Connect extends MainLaunch {
    @Override
    public void start() {
        testObject();
    }

    private void testObject() {
        Student student = new Student();
        student.name = "张三";
        modify(student);
        System.out.println(student.name);

    }

    private void modify(Student student) {
        student.name += "李四";
    }


    private void testString() {
        String str = "hello";
        modify(str);
        System.out.println(str);
    }

    private void modify(String str) {
        str += "World !";
    }
}

class Student {
    public String name;
}
