/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.ChiTietDatPhong;
import java.sql.ResultSet;

/**
 *
 * @author Dương Nguyễn
 */
public class ChiTietDatPhongDAL {

    //Hàm thực hiện câu truy vấn THÊM chi tiết đặt phòng
    public static void CauTruyVanThemChiTietDatPhong(ChiTietDatPhong CTDP) {
        String SQLThem = "insert into ChiTietDatPhong "
                + "values ('" + CTDP.getMaPhieuDat() + "','" + CTDP.getMaPhong() + "')";
        ConnectionDB.ExcuteQueryUpdateDB(SQLThem);
    }

    //Hàm thực hiện câu truy vấn SỬA chi tiết đặt phòng
    public static void CauTruyVanSuaChiTietDatPhong(ChiTietDatPhong CTDP) {
        String SQLSua = "update ChiTietDatPhong "
                + "set MaPhieuDat = '" + CTDP.getMaPhieuDat() + "', MaPhong = '" + CTDP.getMaPhong() + "' "
                + "where MaChiTietDatPhong = " + CTDP.getMaChiTietPhieuDat();
        ConnectionDB.ExcuteQueryUpdateDB(SQLSua);
    }

    //Hàm thực hiện câu truy vấn XÓA chi tiết đặt phòng
    public static void CauTruyVanXoaChiTietDatPhong(String MaChiTietDatPhong) {
        String SQLXoa = "delete from ChiTietDatPhong where MaChiTietDatPhong =" + MaChiTietDatPhong;
        ConnectionDB.ExcuteQueryUpdateDB(SQLXoa);
    }

    //Hàm thực hiện câu truy vấn SELECT chi tiết đặt phòng
    public static ResultSet CauTruyVanLayThongTinChiTietDatPhong() {
        ResultSet rs;
        String SQLSelect = "select * from ChiTietDatPhong";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }

    //Hàm thực hiện câu truy vấn TÌM chi tiết đặt phòng
    public static ResultSet CauTruyVanTimChiTietDatPhong(String Search) {
        ResultSet rs;
        String SQLTim = "select * from ChiTietDatPhong where MaChiTietDatPhong =" + Search;
        rs = ConnectionDB.ExcuteQueryGetTable(SQLTim);
        return rs;
    }
}
