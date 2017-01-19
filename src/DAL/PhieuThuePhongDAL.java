/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.PhieuThuePhong;
import java.sql.ResultSet;

/**
 *
 * @author Dương Nguyễn
 */
public class PhieuThuePhongDAL {

    //Hàm thực hiện câu truy vấn THÊM phiếu thuê phòng
    public static void CauTruyVanThemPhieuThuePhong(PhieuThuePhong PTP) {
        String SQLThem = "insert into PhieuThuePhong "
                + "values ('" + PTP.getMaTaiKhoan() + "','" + PTP.getMaHoaDon() + "')";
        ConnectionDB.ExcuteQueryUpdateDB(SQLThem);
    }

    //Hàm thực hiện câu truy vấn SỬA phiếu thuê phòng
    public static void CauTruyVanSuaPhieuThuePhong(PhieuThuePhong PTP) {
        String SQLSua = "update PhieuThuePhong set "
                + "MaTaiKhoan ='" + PTP.getMaTaiKhoan() + "', MaHoaDon ='" + PTP.getMaHoaDon() + "' "
                + "where MaPhieuThue = " + PTP.getMaPhieuThue();
        ConnectionDB.ExcuteQueryUpdateDB(SQLSua);
    }

    //Hàm thực hiện câu truy vấn XÓA phiếu thuê phòng
    public static void CauTruyVanXoaPhieuThuePhong(String MaPhieuThuePhong) {
        String SQLXoa = "delete from PhieuThuePhong where MaPhieuThue = " + MaPhieuThuePhong;
        ConnectionDB.ExcuteQueryUpdateDB(SQLXoa);
    }

    //Hàm thực hiện câu truy vấn SELECT phiếu thuê phòng
    public static ResultSet CauTruyVanLayThongTinPhieuThuePhong() {
        ResultSet rs;
        String SQLSelect = "select * from PhieuThuePhong";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }

    //Hàm thực hiện câu truy vấn TÌM phiếu thuê phòng
    public static ResultSet CauTruyVanTimPhieuThuePhong(String Search) {
        ResultSet rs;
        String SQLTim = "select * from PhieuThuePhong where MaPhieuThue = " + Search;
        rs = ConnectionDB.ExcuteQueryGetTable(SQLTim);
        return rs;
    }
}
