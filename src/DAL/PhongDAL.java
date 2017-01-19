/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.Phong;
import java.sql.ResultSet;

/**
 *
 * @author Dương Nguyễn
 */
public class PhongDAL {

    //Hàm thực hiện câu truy vấn THÊM phòng
    public static void CauTruyVanThemPhong(Phong Phong) {
        String SQLThem = "insert into Phong values ('" + Phong.getMaLoai() + "',"
                + "'" + Phong.getMaTrangThai() + "','" + Phong.getMaTinhTrang() + "')";
        ConnectionDB.ExcuteQueryUpdateDB(SQLThem);
    }

    //Hàm thực hiện câu truy vấn SỬA phòng
    public static void CauTruyVanSuaPhong(Phong Phong) {
        String SQLSua = "update Phong set MaLoai = " + Phong.getMaLoai()
                + ", MaTrangThai = '" + Phong.getMaTrangThai() + "', MaTinhTrang = " + Phong.getMaTinhTrang()
                + " where MaPhong = " + Phong.getMaPhong();
        ConnectionDB.ExcuteQueryUpdateDB(SQLSua);
    }

    //Hàm thực hiện câu truy vấn XÓA phòng
    public static void CauTruyVanXoaPhong(String MaPhong) {
        String SQLXoa = "delete from Phong where MaPhong = " + MaPhong;
        ConnectionDB.ExcuteQueryUpdateDB(SQLXoa);
    }

    //Hàm thực hiện câu truy vấn SELECT phòng
    public static ResultSet CauTruyVanLayThongTinPhong() {
        ResultSet rs;
        String SQLSelect = "select * from Phong";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }

    //Hàm thực hiện câu truy vấn TÌM phòng
    public static ResultSet CauTruyVanTimPhong(String Search) {
        ResultSet rs;
        String SQLTim = "select * from Phong where MaPhong = " + Search;
        rs = ConnectionDB.ExcuteQueryGetTable(SQLTim);
        return rs;
    }
}
