/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.LoaiPhong;
import java.sql.ResultSet;

/**
 *
 * @author Dương Nguyễn
 */
public class LoaiPhongDAL {

    //Hàm thực hiện câu truy vấn THÊM loại phòng
    public static void CauTruyVanThemLoaiPhong(LoaiPhong LP) {
        String SQLThem = "insert into LoaiPhong values "
                + "(N'" + LP.getTenLoaiPhong() + "','" + LP.getGiaPhong() + "')";
        ConnectionDB.ExcuteQueryUpdateDB(SQLThem);
    }

    //Hàm thực hiện câu truy vấn SỬA loại phòng
    public static void CauTruyVanSuaLoaiPhong(LoaiPhong LP) {
        String SQLSua = "update LoaiPhong set "
                + "TenLoaiPhong = N'" + LP.getTenLoaiPhong() + "', "
                + "GiaPhong ='" + LP.getGiaPhong() + "' "
                + "where MaLoaiPhong =" + LP.getMaLoaiPhong();
        ConnectionDB.ExcuteQueryUpdateDB(SQLSua);
    }

    //Hàm thực hiện câu truy vấn XÓA loại phòng
    public static void CauTruyVanXoaLoaiPhong(String MaLoaiPhong) {
        String SQLXoa = "delete from LoaiPhong where MaLoaiPhong = " + MaLoaiPhong;
        ConnectionDB.ExcuteQueryUpdateDB(SQLXoa);
    }

    //Hàm thực hiện câu truy vấn SELECT loại phòng
    public static ResultSet CauTruyVanLayThongTinLoaiPhong() {
        ResultSet rs;
        String SQLSelect = "select * from LoaiPhong";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }

    //Hàm thực hiện câu truy vấn TÌM loại phòng
    public static ResultSet CauTruyVanTimLoaiPhong(String Search) {
        ResultSet rs;
        String SQLTim = "select * from LoaiPhong where "
                + "TenLoaiPhong like N'%" + Search + "%' or "
                + "GiaPhong like '%" + Search + "%'";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLTim);
        return rs;
    }
}
