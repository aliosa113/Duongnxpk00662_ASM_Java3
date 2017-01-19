/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.Quyen;
import java.sql.ResultSet;

/**
 *
 * @author Dương Nguyễn
 */
public class QuyenDAL {

    //Hàm thực hiện câu truy vấn THÊM
    public static void CauTruyVanThem(Quyen Quyen) {
        String SQLThem = "insert into Quyen values (N'" + Quyen.getTenQuyen() + "',N'" + Quyen.getMoTa() + "')";
        ConnectionDB.ExcuteQueryUpdateDB(SQLThem);
    }

    //Hàm thực hiện câu truy vấn SỬA quyền
    public static void CauTruyVanSuaQuyen(Quyen Quyen) {
        String SQLSua = "update Quyen set "
                + "TenQuyen = N'" + Quyen.getTenQuyen() + "', MoTa = N'" + Quyen.getMoTa() + "' "
                + "where MaQuyen = " + Quyen.getMaQuyen();
        ConnectionDB.ExcuteQueryUpdateDB(SQLSua);
    }

    //Hàm thực hiện câu truy vấn XÓA quyền
    public static void CauTruyVanXoaQuyen(String MaQuyen) {
        String SQLXoa = "delete from Quyen where MaQuyen = " + MaQuyen;
        ConnectionDB.ExcuteQueryUpdateDB(SQLXoa);
    }

    //Hàm thực hiện câu truy vấn SELECT quyền
    public static ResultSet CauTruyVanLayThongTinQuyen() {
        ResultSet rs;
        String SQLSelect = "select * from Quyen";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }

    //Hàm thực hiện câu truy vấn TÌM quyền
    public static ResultSet CauTruyVanTimQuyen(String Search) {
        ResultSet rs;
        String SQLTim = "select * from Quyen "
                + "where TenQuyen like N'%" + Search + "%' or MoTa like N'%" + Search + "%'";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLTim);
        return rs;
    }
}
