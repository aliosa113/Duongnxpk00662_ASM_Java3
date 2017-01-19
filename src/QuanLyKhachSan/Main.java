/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyKhachSan;

import DAL.ConnectionDB;

/**
 *
 * @author DuongAli
 */
public class Main {

    /**
     * Tạo đối tượng kết nối CSDL 
     * và dùng chung cho cả chương trình
     * * Lưu ý:
     * - Phải dùng khóa Public - Để truy cập từ xa
     * - Dùng static để truy xuất nhanh
     */
    public static ConnectionDB myConnection = new ConnectionDB();
    
    public static void main(String[] args) {
        /*
        * Created by Duongnxpk00662
        * 23/08/2016
        * Modified by ?
        * dd/MM/yyyy
        */
//        frmDangNhap frm = new frmDangNhap();
//        frm.show();
        frmQuanLy frma = new frmQuanLy();
        frma.show();
    }
    
}
