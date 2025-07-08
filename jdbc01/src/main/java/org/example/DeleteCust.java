package org.example;

import java.sql.*;

public class DeleteCust {
    public static void main(String[] args) {
        // 1. Mysql Driver Loading ...
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver Not Found");
        }
        // 2. Connection
        String url = "jdbc:mysql://localhost:3306/shopdb";
        String user = "smuser";
        String password = "111111";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database successfully");
        }catch (SQLException e){
            System.out.println("Connection Failed Check output console");
            e.printStackTrace();
            return;
        }
        // 3. SQL 문장 생성
        String DeleteSql = "DELETE FROM CUST WHERE cust_id = ?";
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            pstmt = conn.prepareStatement(DeleteSql);
            pstmt.setString(1, "id22");
            int result = pstmt.executeUpdate();
            System.out.println(result);
        } catch (SQLException e) {
            System.out.println("Failed to prepare statement for selectCust");
            e.printStackTrace();
        } finally{
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {}
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
}
