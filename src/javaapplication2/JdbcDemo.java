package javaapplication2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {


    public static void main(String[] args) {

        try {
            Connection conn =DBConnection.connectDatabase();

            //create connection
            Statement s = conn.createStatement();
            String sql = "Select * from user";
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                System.out.println("Table  are:" + rs.getString("name"));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

   

}
