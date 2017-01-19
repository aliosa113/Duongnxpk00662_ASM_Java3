/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.TinhTrangPhong;
import java.sql.ResultSet;

/**
 *
 * @author Dương Nguyễn
 */
public class TinhTrangPhongDAL {

    //Hàm thực hiện câu truy vấn THÊM tình trạng phòng
    public static void CauTruyVanThemTinhTrangPhong(TinhTrangPhong TTP) {
        String SQLThem = "insert into TinhTrangPhong values (N'" + TTP.getTinhTrang() + "')";
        ConnectionDB.ExcuteQueryUpdateDB(SQLThem);
    }

    //Hàm thực hiện câu truy vấn SỬA tình trạng phòng
    public static void CauTruyVanSuaTinhTrangPhong(TinhTrangPhong TTP) {
        String SQLSua = "update TinhTrangPhong "
                + "set TinhTrang = N'" + TTP.getTinhTrang() + "' "
                + "where MaTinhTrang =" + TTP.getMaTinhTrangPhong();
        ConnectionDB.ExcuteQueryUpdateDB(SQLSua);
    }

    //Hàm thực hiện câu truy vấn XÓA tình trạng phòng
    public static void CauTruyVanXoaTinhTrangPhong(String MaTinhTrangPhong) {
        String SQLXoa = "delete from TinhTrangPhong where MaTinhTrang =" + MaTinhTrangPhong;
        ConnectionDB.ExcuteQueryUpdateDB(SQLXoa);
    }

    //Hàm thực hiện câu truy vấn SELECT tình trạng phòng
    public static ResultSet CauTruyVanLayThongTinTinhTrangPhong() {
        ResultSet rs;
        String SQLSelect = "select * from TinhTrangPhong";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }

    //Hàm thực hiện câu truy vấn TÌM tình trạng phòng
    public static ResultSet CauTruyVanTimTinhTrangPhong(String Search) {
        ResultSet rs;
        String SQLTim = "select * from TinhTrangPhong where TinhTrang like N'%" + Search + "%'";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLTim);
        return rs;
    }
}
