/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.ChiTietTrangThietBi;
import java.sql.ResultSet;

/**
 *
 * @author Dương Nguyễn
 */
public class ChiTietTrangThietBiDAL {

    //Hàm thực hiện câu truy vấn THÊM chi tiết trang thiết bị
    public static void CauTruyVanThemChiTietTrangThietBi(ChiTietTrangThietBi CTTTB) {
        String SQLThem = "insert into ChiTietVatTu values ('" + CTTTB.getMaThietBi() + "',"
                + "'" + CTTTB.getMaLoaiPhong() + "','" + CTTTB.getSoLuong() + "')";
        ConnectionDB.ExcuteQueryUpdateDB(SQLThem);
    }

    //Hàm thực hiện câu truy vấn SỬA chi tiết trang thiết bị
    public static void CauTruyVanSuaChiTietTrangThietBi(ChiTietTrangThietBi CTTTB) {
        String SQLSua = "update ChiTietVatTu set MaThietBi = '" + CTTTB.getMaThietBi() + "',"
                + " MaLoaiPhong = '" + CTTTB.getMaLoaiPhong() + "', SoLuong = '" + CTTTB.getSoLuong() + "' "
                + "where MaChiTiet = " + CTTTB.getMaChiTiet();
        ConnectionDB.ExcuteQueryUpdateDB(SQLSua);
    }

    //Hàm thực hiện câu truy vấn XÓA chi tiết trang thiết bị
    public static void CauTruyVanXoaChiTietTrangThietBi(String MaChiTietTrangThietBi) {
        String SQLXoa = "delete from ChiTietVatTu where MaChiTiet =" + MaChiTietTrangThietBi;
        ConnectionDB.ExcuteQueryUpdateDB(SQLXoa);
    }

    //Hàm thực hiện câu truy vấn SELECT chi tiết trang thiết bị
    public static ResultSet CauTruyVanLayThongTinChiTietTrangThietBi() {
        ResultSet rs;
        String SQLSelect = "select * from ChiTietVatTu";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }

    //Hàm thực hiện câu truy vấn TÌM chi tiết trang thiết bị
    public static ResultSet CauTruyVanTimChiTietTrangThietBi(String Search) {
        ResultSet rs;
        String SQLTim = "select * from ChiTietVatTu where MaChiTiet = " + Search;
        rs = ConnectionDB.ExcuteQueryGetTable(SQLTim);
        return rs;
    }
}
