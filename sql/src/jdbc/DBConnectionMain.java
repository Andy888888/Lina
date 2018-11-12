package jdbc;

import core.MainLaunch;

import java.sql.*;

/**
 * 描述:数据库连接.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/11/12
 */
public class DBConnectionMain extends MainLaunch {
    @Override
    public void start() {

        JDBCUtil jdbcUtil = new JDBCUtil();
        Connection connection = null;
        ResultSet resultSet = null;
        String sql = "select * from student";
        try {
            long start = System.currentTimeMillis();
            connection = jdbcUtil.getConnection();
            long end = System.currentTimeMillis();
            System.out.println("连接耗时：" + (end - start));

            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
//            PreparedStatement statement = connection.prepareStatement(sql);
//            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("sname");
                int age = resultSet.getInt("age");

                System.out.println(name + " = " + age);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
