/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.HoaDon;
import java.sql.ResultSet;

/**
 *
 * @author Dương Nguyễn
 */
public class HoaDonDAL {

    //Hàm thực hiện câu truy vấn THÊM hóa đơn
    public static void CauTruyVanThemHoaDon(HoaDon HD) {
        String SQLThem = "insert into HoaDon values "
                + "('" + HD.getNgayThanhToan() + "','" + HD.getTongTien() + "',"
                + "'" + HD.getMaPhieuThue() + "','" + HD.getMaKhachHang() + "',"
                + "'" + HD.getMaTaiKhoan() + "')";
        ConnectionDB.ExcuteQueryUpdateDB(SQLThem);
    }

    //Hàm thực hiện câu truy vấn SỬA hóa đơn
    public static void CauTruyVanSuaHoaDon(HoaDon HD) {
        String SQLSua = "update HoaDon set NgayThanhToan = '" + HD.getNgayThanhToan() + "', "
                + "TongTien = '" + HD.getTongTien() + "', MaPhieuThue = '" + HD.getMaPhieuThue() + "',"
                + " MaKhachHang ='" + HD.getMaKhachHang() + "', MaTaiKhoan ='" + HD.getMaTaiKhoan() + "' "
                + "where MaHoaDon =" + HD.getMaHoaDon();
        ConnectionDB.ExcuteQueryUpdateDB(SQLSua);
    }

    //Hàm thực hiện câu truy vấn XÓA hóa đơn
    public static void CauTruyVanXoaHoaDon(String MaHoaDon) {
        String SQLXoa = "delete from HoaDon where MaHoaDon = " + MaHoaDon;
        ConnectionDB.ExcuteQueryUpdateDB(SQLXoa);
    }

    //Hàm thực hiện câu truy vấn SELECT hóa đơn
    public static ResultSet CauTruyVanLayThongTinHoaDon() {
        ResultSet rs;
        String SQLSelect = "select * from HoaDon";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }

    //Hàm thực hiện câu truy vấn TÌM hóa đơn
    public static ResultSet CauTruyVanTimHoaDon(String Search) {
        ResultSet rs;
        String SQLTim = "select * from HoaDon where MaHoaDon =" + Search;
        rs = ConnectionDB.ExcuteQueryGetTable(SQLTim);
        return rs;
    }
}
