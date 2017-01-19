/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dương Nguyễn
 */
public class NhanVienDAL {

    //Hàm thực hiện câu truy vấn THÊM nhân viên
    public static void CauTruyVanThemNhanVien(NhanVien NV) {
        String SQLThem = "insert into NhanVien "
                + "values (N'" + NV.getTenNhanVien() + "','" + NV.getGioiTinh() + "',"
                + "'" + NV.getNgaySinh() + "',N'" + NV.getDiaChi() + "',"
                + "'" + NV.getSoCMND() + "','" + NV.getSDT() + "',"
                + "'" + NV.getEmail() + "','" + NV.getChucVu() + "',"
                + "'" + NV.getNgayVaoLam() + "','" + NV.getLuong() + "')";
        ConnectionDB.ExcuteQueryUpdateDB(SQLThem);
    }

    //Hàm thực hiện câu truy vấn SỬA nhân viên
    public static void CauTruyVanSuaNhanVien(NhanVien NV) {
        String SQLSua = "update NhanVien set "
                + "TenNhanVien = N'" + NV.getTenNhanVien() + "', GioiTinh = '" + NV.getGioiTinh() + "',"
                + " NgaySinh = '" + NV.getNgaySinh() + "', DiaChi = N'" + NV.getDiaChi() + "',"
                + " SoCMND = '" + NV.getSoCMND() + "', SDT = '" + NV.getSDT() + "',"
                + " Email = '" + NV.getEmail() + "' ,MaChucVu = '" + NV.getChucVu() + "',"
                + " NgayVaoLam = '" + NV.getNgayVaoLam() + "', Luong = '" + NV.getLuong() + "'"
                + " where MaNhanVien = " + NV.getMaNhanVien();
        ConnectionDB.ExcuteQueryUpdateDB(SQLSua);
    }

    //Hàm thực hiện câu truy vấn XÓA nhân viên
    public static void CauTruyVanXoaNhanVien(String MaNhanVien) {
        String SQLXoa = "delete from NhanVien where MaNhanVien = " + MaNhanVien;
        ConnectionDB.ExcuteQueryUpdateDB(SQLXoa);
    }

    //Hàm thực hiện câu truy vấn SELECT nhân viên
    public static ResultSet CauTruyVanLayThongTinNhanVien() {
        ResultSet rs;
        String SQLSelect = "select * from NhanVien";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }

    //Hàm thực hiện câu truy vấn TÌM nhân viên
    public static ResultSet CauTruyVanTimNhanVien(String Search) {
        ResultSet rs;
        String SQLTim = "select * from NhanVien where "
                + "TenNhanVien like N'%" + Search + "%' or "
                + "SoCMND like '%" + Search + "%' or "
                + "SDT like '%" + Search + "%' or "
                + "Email like '%" + Search + "%'";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLTim);
        return rs;
    }

    //Hàm lấy tên chức vụ dựa vào mã chức vụ
    public static String LayTenChucVuDuaVaoMaChucVu(String MaChucVu) {
        String TenChucVu = "";
        String SQLLayTenChucVu = "select TenChucVu from ChucVu where MaChucVu = " + MaChucVu;
        ResultSet rs = ConnectionDB.ExcuteQueryGetTable(SQLLayTenChucVu);
        try {
            while (rs.next()) {
                TenChucVu = rs.getString("TenChucVu");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return TenChucVu;
    }
}
