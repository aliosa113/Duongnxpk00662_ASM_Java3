/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.TinhTrangThietBi;
import java.sql.ResultSet;

/**
 *
 * @author Dương Nguyễn
 */
public class TinhTrangThietBiDAL {
        
    //Hàm thực hiện câu truy vấn THÊM tình trạng thiết bị
    public static void CauTruyVanThemTinhTrangThietBi(TinhTrangThietBi TRTB) {
        String SQLThem = "insert into TinhTrangThietBi values (N'"+TRTB.getTinhTrang()+"')";
        ConnectionDB.ExcuteQueryUpdateDB(SQLThem);
    }

    //Hàm thực hiện câu truy vấn SỬA tình trạng thiết bị
    public static void CauTruyVanSuaTinhTrangThietBi(TinhTrangThietBi TRTB) {
        String SQLSua = "update TinhTrangThietBi set "
                + "TinhTrang = N'"+TRTB.getTinhTrang()+"' "
                + "where MaTinhTrang = '"+TRTB.getMaTinhTrang()+"'";
        ConnectionDB.ExcuteQueryUpdateDB(SQLSua);
    }

    //Hàm thực hiện câu truy vấn XÓA tình trạng thiết bị
    public static void CauTruyVanXoaTinhTrangThietBi(String MaTinhTrangThietBi) {
        String SQLXoa = "delete from TinhTrangThietBi where MaTinhTrang = "+ MaTinhTrangThietBi;
        ConnectionDB.ExcuteQueryUpdateDB(SQLXoa);
    }

    //Hàm thực hiện câu truy vấn SELECT tình trạng thiết bị
    public static ResultSet CauTruyVanLayThongTinTinhTrangThietBi() {
        ResultSet rs;
        String SQLSelect = "select * from TinhTrangThietBi";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }

    //Hàm thực hiện câu truy vấn TÌM tình trạng thiết bị
    public static ResultSet CauTruyVanTimTinhTrangThietBi(String Search) {
        ResultSet rs;
        String SQLTim = "select * from TinhTrangThietBi where TinhTrang like N'%"+Search+"%'";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLTim);
        return rs;
    }
}
