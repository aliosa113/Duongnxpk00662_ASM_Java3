/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DichVu;
import java.sql.ResultSet;

/**
 *
 * @author Dương Nguyễn
 */
public class DichVuDAL {

    //Hàm thực hiện câu truy vấn THÊM dịch vụ
    public static void CauTruyVanThemDichVu(DichVu DV) {
        String SQLThem = "insert into DichVu "
                + "values (N'" + DV.getTenDichVu() + "','" + DV.getGia() + "')";
        ConnectionDB.ExcuteQueryUpdateDB(SQLThem);
    }

    //Hàm thực hiện câu truy vấn SỬA dịch vụ
    public static void CauTruyVanSuaDichVu(DichVu DV) {
        String SQLSua = "update DichVu set "
                + "TenDichVu = N'" + DV.getTenDichVu() + "', Gia = '" + DV.getGia() + "' "
                + "where MaDichVu = " + DV.getMaDichVu();
        ConnectionDB.ExcuteQueryUpdateDB(SQLSua);
    }

    //Hàm thực hiện câu truy vấn XÓA dịch vụ
    public static void CauTruyVanXoaDichVu(String MaDichVu) {
        String SQLXoa = "delete from DichVu where MaDichVu =" + MaDichVu;
        ConnectionDB.ExcuteQueryUpdateDB(SQLXoa);
    }

    //Hàm thực hiện câu truy vấn SELECT dịch vụ
    public static ResultSet CauTruyVanLayThongTinDichVu() {
        ResultSet rs;
        String SQLSelect = "select * from DichVu";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }

    //Hàm thực hiện câu truy vấn TÌM dịch vụ
    public static ResultSet CauTruyVanTimDichVu(String Search) {
        ResultSet rs;
        String SQLTim = "select * from DichVu where TenDichVu like N'%" + Search + "%'";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLTim);
        return rs;
    }
}
