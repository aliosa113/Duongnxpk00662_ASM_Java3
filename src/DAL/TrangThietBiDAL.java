/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.TrangThietBi;
import java.sql.ResultSet;

/**
 *
 * @author Dương Nguyễn
 */
public class TrangThietBiDAL {

    //Hàm thực hiện câu truy vấn THÊM trang thiết bị
    public static void CauTruyVanThemTrangThietBi(TrangThietBi TTB) {
        String SQLThem = "insert into TrangThietBi values "
                + "(N'" + TTB.getTenThietBi() + "',N'" + TTB.getMoTa() + "','" + TTB.getMaTinhTrang() + "')";
        ConnectionDB.ExcuteQueryUpdateDB(SQLThem);
    }

    //Hàm thực hiện câu truy vấn SỬA trang thiết bị
    public static void CauTruyVanSuaTrangThietBi(TrangThietBi TTB) {
        String SQLSua = "update TrangThietBi set "
                + "TenThietBi = N'" + TTB.getTenThietBi() + "', "
                + "MoTa = N'" + TTB.getMoTa() + "', MaTinhTrang = '" + TTB.getMaTinhTrang() + "' "
                + "where MaThietBi = '" + TTB.getMaThietBi() + "'";
        ConnectionDB.ExcuteQueryUpdateDB(SQLSua);
    }

    //Hàm thực hiện câu truy vấn XÓA trang thiết bị
    public static void CauTruyVanXoaTrangThietBi(String MaTrangThietBi) {
        String SQLXoa = "delete from TrangThietBi where MaThietBi =" + MaTrangThietBi;
        ConnectionDB.ExcuteQueryUpdateDB(SQLXoa);
    }

    //Hàm thực hiện câu truy vấn SELECT trang thiết bị
    public static ResultSet CauTruyVanLayThongTinTrangThietBi() {
        ResultSet rs;
        String SQLSelect = "select * from TrangThietBi";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }

    //Hàm thực hiện câu truy vấn TÌM trang thiết bị
    public static ResultSet CauTruyVanTimTrangThietBi(String Search) {
        ResultSet rs;
        String SQLTim = "select * from TrangThietBi "
                + "where TenThietBi like N'%" + Search + "%' or MoTa like N'%" + Search + "%'";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLTim);
        return rs;
    }
}
