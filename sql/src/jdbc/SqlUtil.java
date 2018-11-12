package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 描述:简单的数据库连接工具.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/11/12
 */
public class SqlUtil {
    private String driver;
    private String url;
    private String dbName;
    private String password;

    public SqlUtil() {

//        this.driver = "com.mysql.jdbc.Driver";
        this.driver = "com.mysql.cj.jdbc.Driver";
        this.url = "jdbc:mysql://localhost:3306/DBTest";
        this.dbName = "root";
        this.password = "yanwenqiang";

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection connection;

    public Connection getConnection() throws SQLException {
        connection = DriverManager.getConnection(url, dbName, password);
        return connection;
    }

    public void closeConn() throws SQLException {
        if (this.connection != null) {
            this.connection.close();
        }
    }
}
