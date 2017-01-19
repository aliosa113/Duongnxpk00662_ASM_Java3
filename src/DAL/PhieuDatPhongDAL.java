/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.PhieuDatPhong;
import java.sql.ResultSet;

/**
 *
 * @author Dương Nguyễn
 */
public class PhieuDatPhongDAL {

    //Hàm thực hiện câu truy vấn THÊM phiếu đặt phòng
    public static void CauTruyVanThemPhieuDatPhong(PhieuDatPhong PDP) {
        String SQLThem = "insert into PhieuDatPhong values "
                + "('" + PDP.getMaPhieuThue() + "','" + PDP.getMaKhachHang() + "',"
                + "'" + PDP.getNgayThuePhong() + "','" + PDP.getNgayTraPhong() + "',"
                + "'" + PDP.getTienDatCoc() + "','" + PDP.getMaTaiKhoan() + "',"
                + "'" + PDP.getTinhTrang() + "','" + PDP.getSoNguoi() + "')";
        ConnectionDB.ExcuteQueryUpdateDB(SQLThem);
    }

    //Hàm thực hiện câu truy vấn SỬA phiếu đặt phòng
    public static void CauTruyVanSuaPhieuDatPhong(PhieuDatPhong PDP) {
        String SQLSua = "update PhieuDatPhong set "
                + "MaPhieuThue = '" + PDP.getMaPhieuThue() + "', MaKhachHang = '" + PDP.getMaKhachHang() + "', "
                + "NgayThuePhong = '" + PDP.getNgayThuePhong() + "', NgayTraPhong = '" + PDP.getNgayTraPhong() + "', "
                + "TienDatCoc = '" + PDP.getTienDatCoc() + "', MaTaiKhoan = '" + PDP.getMaTaiKhoan() + "', "
                + "TinhTrang = '" + PDP.getTinhTrang() + "', SoNguoi = '" + PDP.getSoNguoi() + "' "
                + "where MaPhieuDat ='" + PDP.getMaPhieuDat() + "'";
        ConnectionDB.ExcuteQueryUpdateDB(SQLSua);
    }

    //Hàm thực hiện câu truy vấn XÓA phiếu đặt phòng
    public static void CauTruyVanXoaPhieuDatPhong(String MaPhieuDatPhong) {
        String SQLXoa = "delete from PhieuDatPhong where MaPhieuDat =" + MaPhieuDatPhong;
        ConnectionDB.ExcuteQueryUpdateDB(SQLXoa);
    }

    //Hàm thực hiện câu truy vấn SELECT phiếu đặt phòng
    public static ResultSet CauTruyVanLayThongTinPhieuDatPhong() {
        ResultSet rs;
        String SQLSelect = "select * from PhieuDatPhong";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }

    //Hàm thực hiện câu truy vấn TÌM phiếu đặt phòng
    public static ResultSet CauTruyVanTimPhieuDatPhong(String Search) {
        ResultSet rs;
        String SQLTim = "select * from PhieuDatPhong where MaPhieuDat = " + Search;
        rs = ConnectionDB.ExcuteQueryGetTable(SQLTim);
        return rs;
    }
}
