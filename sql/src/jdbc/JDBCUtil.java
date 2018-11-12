package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/11/12
 */
public class JDBCUtil {
    private String driver;
    private String url;
    private String user;
    private String password;

    public JDBCUtil() {
        Properties prop = new Properties();
        //加载配置文件
        try {
            prop.load(this.getClass().getResourceAsStream("jdbc.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.driver = prop.getProperty("driver");
        this.url = prop.getProperty("url");
        this.user = prop.getProperty("user");
        this.password = prop.getProperty("pwd");

        try {
            long start = System.currentTimeMillis();
            Class.forName(driver);
            long end = System.currentTimeMillis();
            System.out.println("反射耗时：" + (end - start));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Connection connection;

    public Connection getConnection() throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    public void closeConn() throws SQLException {
        if (this.connection != null) {
            this.connection.close();
        }
    }
}
