package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertCust {
    public static void main(String[] args) {
        // 1. MySQL JDBC Driver Loading
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        // 2. Connection
        String url = "jdbc:mysql://localhost:3306/smdb";
        String sqlid = "smuser";
        String sqlpwd = "111111";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, sqlid, sqlpwd);
            System.out.println("Connected to database");
        } catch (SQLException e) {
            System.out.println("Connection error");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        // 3. SQL
        String insertSql = "INSERT INTO cust VALUES(?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(insertSql);
            ps.setString(1, "id05");
            ps.setString(2, "pwd05");
            ps.setString(3, "홍말숙");
            int result = ps.executeUpdate();
            System.out.println(result);
            System.out.println("Inserted rows into database");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
