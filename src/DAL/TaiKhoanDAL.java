/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.TaiKhoan;
import java.sql.ResultSet;

/**
 *
 * @author DuongAli
 */
public class TaiKhoanDAL {

    //Hàm thực hiện câu truy vấn THÊM tài khoản
    public static void CauTruyVanThemTaiKhoan(TaiKhoan TK) {
        String SQLThem = "insert into TaiKhoan values (N'" + TK.getTenDangNhap() + "',"
                + "N'" + TK.getMatKhau() + "','" + TK.getQuyen() + "',1)";
        ConnectionDB.ExcuteQueryUpdateDB(SQLThem);
    }

    //Hàm thực hiện câu truy vấn SỬA tài khoản
    public static void CauTruyVanSuaTaiKhoan(TaiKhoan TK) {
        String SQLSua = "update TaiKhoan set UserName = N'" + TK.getTenDangNhap() + "',"
                + " PassWord = N'" + TK.getMatKhau() + "', MaQuyen = " + TK.getQuyen()
                + " where MaTaiKhoan = " + TK.getMaTaiKhoan();
        ConnectionDB.ExcuteQueryUpdateDB(SQLSua);
    }

    //Hàm thực hiện câu truy vấn XÓA tài khoản
    public static void CauTruyVanXoaTaiKhoan(String MaTaiKhoan) {
        String SQLXoa = "delete from TaiKhoan where MaTaiKhoan = " + MaTaiKhoan;
        ConnectionDB.ExcuteQueryUpdateDB(SQLXoa);
    }

    //Hàm thực hiện câu truy vấn SELECT tài khoản
    public static ResultSet CauTruyVanLayThongTinTaiKhoan() {
        ResultSet rs;
        String SQLSelect = "select * from TaiKhoan";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }

    //Hàm thực hiện câu truy vấn TÌM tài khoản
    public static ResultSet CauTruyVanTimTaiKhoan(String Search) {
        ResultSet rs;
        String SQLTim = "select * from TaiKhoan where UserName like N'%" + Search + "%'";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLTim);
        return rs;
    }
}
