package reflect;

import core.MainLaunch;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/11/12
 */
public class ReflectMainLaunch extends MainLaunch {
    @Override
    public void start() {
        run();
//        while (true) {
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            run();
//        }
    }

    private void run() {
        Properties prop = new Properties();
        //加载配置文件
        try {
            prop.load(this.getClass().getResourceAsStream("traffic.txt"));
//            prop.load(this.getClass().getClassLoader().getResource("~/Desktop/Github/Organization/ywqln/Lina/basics/src/reflect/traffic.txt").openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        String className = prop.getProperty("trafficTool");
        System.out.println(className);

        try {
            Class clz = Class.forName(className);
            Method method = clz.getDeclaredMethod("run");
            Object obj = clz.newInstance();
            method.invoke(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public String readToString(String fileName) {
        String encoding = "UTF-8";
        File file = new File(fileName);
        Long filelength = file.length();
        byte[] filecontent = new byte[filelength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return new String(filecontent, encoding);
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
        }
    }
}
