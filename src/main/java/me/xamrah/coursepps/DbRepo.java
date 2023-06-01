package me.xamrah.coursepps;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DbRepo {
    public static Connection connection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        Properties props = new Properties();
        props.setProperty("user","postgres");
        props.setProperty("password","postgres");
        props.setProperty("characterEncoding","UTF-8");
        Connection conn = DriverManager.getConnection(url, props);
        return conn;
    }

    public static Connection nowConnection;
    static {
        try {
            nowConnection = connection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public boolean createUser(String name, String sex, String password, String date, String email) throws SQLException {
        PreparedStatement statement = nowConnection.prepareStatement("insert into users (name, sex, password, date, email) values (?, ?, ?, ?, ?)");
        statement.setString(1, name);
        statement.setString(2, sex);
        statement.setString(3, password);
        statement.setString(4, date);
        statement.setString(5, email);

        return statement.execute();
    }

    public boolean checkAutorizeUser(String email, String password) throws SQLException {
        List<User> driverList = DbRepo.getAllUsersByLoginAndPassword(email, password);
        if (!driverList.isEmpty() && driverList.get(0).getPassword().equals(password)){
            return true;
        } else return false;
    }

    public static List<User> getAllUsersByLoginAndPassword(String login, String password) throws SQLException{
        PreparedStatement statement = nowConnection.prepareStatement("select id, email, name, password from users where email = ? and password = ?");
        statement.setString(1, login);
        statement.setString(2, password);
        boolean hasResult = statement.execute();
        List<User> users = new ArrayList<>();

        if(hasResult) {
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()){
                User d = new User();
                d.setId(resultSet.getInt(1));
                d.setEmail(resultSet.getString(2));
                d.setName(resultSet.getString(3));
                d.setPassword(resultSet.getString(4));
                users.add(d);
            }
        }
        return users;
    }
}
