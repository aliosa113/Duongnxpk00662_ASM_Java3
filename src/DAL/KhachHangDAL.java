/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.KhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DuongAli
 */
public class KhachHangDAL {

    //Hàm thực hiện câu truy vấn THÊM khách hàng
    public static void CauTruyVanThemKhachHang(KhachHang KH) {
        String SQLThem = "insert into KhachHang "
                + "values (N'" + KH.getTenKhachHang() + "','" + KH.getGioiTinh() + "','" + KH.getNgaySinh() + "',"
                + "N'" + KH.getDiaChi() + "',"
                + "'" + KH.getSoCMND() + "','" + KH.getSDT() + "','" + KH.getEmail() + "','" + KH.getLoaiKhachHang() + "')";
        ConnectionDB.ExcuteQueryUpdateDB(SQLThem);
    }

    //Hàm thực hiện câu truy vấn SỬA khách hàng
    public static void CauTruyVanSuaKhachHang(KhachHang KH) {
        String SQLSua = "update KhachHang set TenKH = N'" + KH.getTenKhachHang() + "', GioiTinh = '" + KH.getGioiTinh() + "',"
                + " NgaySinh = '" + KH.getNgaySinh() + "', DiaChi = N'" + KH.getDiaChi() + "',"
                + " SoCMND = '" + KH.getSoCMND() + "', SDT = '" + KH.getSDT() + "', Email = '" + KH.getEmail() + "',"
                + " MaLoaiKH = '" + KH.getLoaiKhachHang() + "' where MaKH  = '" + KH.getMaKhachHang() + "'";
        ConnectionDB.ExcuteQueryUpdateDB(SQLSua);
    }

    //Hàm thực hiện câu truy vấn XÓA khách hàng
    public static void CauTruyVanXoaKhachHang(String MaKhachHang) {
        String SQLXoa = "delete from KhachHang where MaKH = " + MaKhachHang;
        ConnectionDB.ExcuteQueryUpdateDB(SQLXoa);
    }

    //Hàm thực hiện câu truy vấn SELECT khách hàng
    public static ResultSet CauTruyVanLayThongTinKhachHang() {
        ResultSet rs;
        String SQLSelect = "select MaKH,TenKH,GioiTinh,CONVERT (nchar,NgaySinh,105) as [NgaySinh],DiaChi,SoCMND,SDT,Email,MaLoaiKH from KhachHang";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }

    //Hàm thực hiện câu truy vấn TÌM khách hàng theo Tên, CMND, SĐT
    public static ResultSet TimKhachHang(String KH) {
        ResultSet rs;
        String SQLTim = "select * from KhachHang where TenKH like N'%" + KH + "%' or SoCMND like N'%" + KH + "%' or SDT like N'%" + KH + "%'";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLTim);
        return rs;
    }

    //Hàm thực hiện câu truy vấn lấy loại khách hàng theo mã khách hàng
    public static String LayLoaiKhachHangDuaVaoMaKhachHang(String MaLoaiKH) {
        String LoaiKhachHang = "";
        String SQLLayLoaiKhachHang = "select TenLoaiKH from LoaiKhachHang where MaLoaiKH = " + MaLoaiKH;
        ResultSet rs = ConnectionDB.ExcuteQueryGetTable(SQLLayLoaiKhachHang);
        try {
            while (rs.next()) {
                LoaiKhachHang = rs.getString("TenLoaiKH");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return LoaiKhachHang;
    }
}
