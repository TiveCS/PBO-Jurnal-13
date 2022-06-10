/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.tp.pkg13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Fathan
 */
public class SQLConnector {
    private static SQLConnector instance = null;

    public static SQLConnector getInstance(){
        if (instance == null) instance = new SQLConnector();
        return instance;
    }

    private Connection connection = null;

    private SQLConnector(){}

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection == null || connection.isClosed()){
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        }
        return connection;
    }
}
