/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sijan
 */
public class DBConnection {

    private static final String url = "jdbc:mysql://localhost:3306/test";
    private static final String user = "admin";
    private static final String dbPassword = "admin4321";

    public static Connection connectDatabase() throws ClassNotFoundException, SQLException {
        //step 1 register the driver

        Class.forName("com.mysql.jdbc.Driver");
        //step 2: get connection
        Connection conn = DriverManager.getConnection(url, user, dbPassword);
        return conn;
    }
}
