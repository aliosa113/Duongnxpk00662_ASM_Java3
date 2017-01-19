/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.TrangThaiPhong;
import java.sql.ResultSet;

/**
 *
 * @author Dương Nguyễn
 */
public class TrangThaiPhongDAL {

    //Hàm thực hiện câu truy vấn THÊM trạng thái phòng
    public static void CauTruyVanThemTrangThaiPhong(TrangThaiPhong TTP) {
        String SQLThem = "insert into TrangThaiPhong values (N'" + TTP.getTrangThai() + "')";
        ConnectionDB.ExcuteQueryUpdateDB(SQLThem);
    }

    //Hàm thực hiện câu truy vấn SỬA trạng thái phòng
    public static void CauTruyVanSuaTrangThaiPhong(TrangThaiPhong TTP) {
        String SQLSua = "update TrangThaiPhong set TrangThai = N'" + TTP.getTrangThai() + "' "
                + "where MaTrangThai =" + TTP.getMaTrangThaiPhong();
        ConnectionDB.ExcuteQueryUpdateDB(SQLSua);
    }

    //Hàm thực hiện câu truy vấn XÓA trạng thái phòng
    public static void CauTruyVanXoaTrangThaiPhong(String MaTrangThaiPhong) {
        String SQLXoa = "delete TrangThaiPhong where MaTrangThai =" + MaTrangThaiPhong;
        ConnectionDB.ExcuteQueryUpdateDB(SQLXoa);
    }

    //Hàm thực hiện câu truy vấn SELECT trạng thái phòng
    public static ResultSet CauTruyVanLayThongTinTrangThaiPhong() {
        ResultSet rs;
        String SQLSelect = "select * from TrangThaiPhong";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }

    //Hàm thực hiện câu truy vấn TÌM trạng thái phòng
    public static ResultSet CauTruyVanTimTrangThaiPhong(String Search) {
        ResultSet rs;
        String SQLTim = "select * from TrangThaiPhong where TrangThai like N'%" + Search + "%'";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLTim);
        return rs;
    }
}
