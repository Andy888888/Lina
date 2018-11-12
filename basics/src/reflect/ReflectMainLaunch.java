package reflect;

import core.MainLaunch;

import java.io.IOException;
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
        Properties prop = new Properties();
        //加载配置文件
        try {
            prop.load(this.getClass().getResourceAsStream("traffic.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String className = prop.getProperty("trafficTool");
        Class clz = null;
        try {
            clz = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        try {
            Method method = clz.getDeclaredMethod("run");
            Object obj = clz.newInstance();
            method.invoke(obj);
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
}
