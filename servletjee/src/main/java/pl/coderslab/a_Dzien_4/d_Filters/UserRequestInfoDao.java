package pl.coderslab.a_Dzien_4.d_Filters;

import java.sql.*;

public class UserRequestInfoDao {

    private static final String USER = "root";
    private static final String PASSWORD = "password";
    private static final String DB_NAME = "demo_db";
    private static final String DB_HOST = "jdbc:mysql://localhost:3306/";
    private static final String DB_OPTIONS = "?useSSL=false&characterEncoding=utf8&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";


    private static final String CREATE_USER_REQUEST_INFO_QUERY = "insert into user_info_log(dateTime, user_agent, request_time) values (?,?,?);";

    public UserRequestInfo create(UserRequestInfo userRequestInfo){
        try (Connection conn = getConnection()) {
            PreparedStatement statement =
                    conn.prepareStatement(CREATE_USER_REQUEST_INFO_QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, userRequestInfo.getDateTime().toString());
            statement.setString(2, userRequestInfo.getUserAgent());
            statement.setInt(3, userRequestInfo.getRequestTime());
            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                userRequestInfo.setId(resultSet.getInt(1));
            }
            return userRequestInfo;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        return DriverManager.getConnection(
                DB_HOST + DB_NAME + DB_OPTIONS,
                USER, PASSWORD);
    }



}
