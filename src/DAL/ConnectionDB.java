/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DuongAli
 */
public class ConnectionDB {

    static Connection conn;
    String SQLconnection = "jdbc:sqlserver://DUONGNGUYEN:1433; databaseName=ASM_Java3;"
            + "user=DuongNguyen;"
            + "password=123456";

    public ConnectionDB() {
        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            conn = DriverManager.getConnection(SQLconnection);
            if (conn != null) {
                System.out.println("Kết nối SQL sever thành công!");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    /**
     * Hàm thực thi câu lệnh select Đầu vào: @CauTruyVan cần thực thi Đầu ra: ResultSet bảng dữ liệu vì câu select trả về bảng dữ liệu
     */
    public static ResultSet ExcuteQueryGetTable(String cauTruyVanSQL) {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(cauTruyVanSQL);
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return null;
    }

    /**
     * Hàm thực thi câu lệnh UPDATE, DELETE, INSERT Đầu vào: @cauTruyVanSQL Đầu ra: thực thi và cập nhật vào CSDL
     */
    public static void ExcuteQueryUpdateDB(String cauTruyVanSQL) {
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(cauTruyVanSQL);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

}
