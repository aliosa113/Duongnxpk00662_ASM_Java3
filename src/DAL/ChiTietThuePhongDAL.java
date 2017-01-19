/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.ChiTietThuePhong;
import java.sql.ResultSet;

/**
 *
 * @author Dương Nguyễn
 */
public class ChiTietThuePhongDAL {

    //Hàm thực hiện câu truy vấn THÊM chi tiết thuê phòng
    public static void CauTruyVanThemChiTietThuePhong(ChiTietThuePhong CTTP) {
        String SQLThem = "insert into ChiTietThuePhong "
                + "values ('" + CTTP.getMaPhieuThue() + "','" + CTTP.getMaPhong() + "',"
                + "'" + CTTP.getNgayTao() + "','" + CTTP.getMaDichVu() + "',"
                + "'" + CTTP.getSoLuong() + "')";
        ConnectionDB.ExcuteQueryUpdateDB(SQLThem);
    }

    //Hàm thực hiện câu truy vấn SỬA chi tiết thuê phòng
    public static void CauTruyVanSuaChiTietThuePhong(ChiTietThuePhong CTTP) {
        String SQLSua = "update ChiTietThuePhong set "
                + "MaPhieuThue ='" + CTTP.getMaPhieuThue() + "', "
                + "MaPhong = '" + CTTP.getMaPhong() + "', NgayTao = '" + CTTP.getNgayTao() + "', "
                + "MaDichVu = '" + CTTP.getMaDichVu() + "', SoLuong = '" + CTTP.getSoLuong() + "' "
                + "where MaChiTietThuePhong =" + CTTP.getMaChiTietThuePhong();
        ConnectionDB.ExcuteQueryUpdateDB(SQLSua);
    }

    //Hàm thực hiện câu truy vấn XÓA chi tiết thuê phòng
    public static void CauTruyVanXoaChiTietThuePhong(String MaChiTietThuePhong) {
        String SQLXoa = "delete from ChiTietThuePhong where MaChiTietThuePhong = " + MaChiTietThuePhong;
        ConnectionDB.ExcuteQueryUpdateDB(SQLXoa);
    }

    //Hàm thực hiện câu truy vấn SELECT chi tiết thuê phòng
    public static ResultSet CauTruyVanLayThongTinChiTietThuePhong() {
        ResultSet rs;
        String SQLSelect = "select * from ChiTietThuePhong";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }

    //Hàm thực hiện câu truy vấn TÌM chi tiết thuê phòng
    public static ResultSet CauTruyVanTimChiTietThuePhong(String Search) {
        ResultSet rs;
        String SQLTim = "select * from ChiTietThuePhong where MaChiTietThuePhong = " + Search;
        rs = ConnectionDB.ExcuteQueryGetTable(SQLTim);
        return rs;
    }
}
