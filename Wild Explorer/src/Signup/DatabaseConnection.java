package Signup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static DatabaseConnection instance = null;
    private Connection connection;
    private DatabaseConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/wildexplorer", "root", "");
            System.out.println("Connection Success");
        }
        catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    public static DatabaseConnection getInstance(){
        if(instance ==null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public Connection getConnection(){
        return connection;
    }
}
