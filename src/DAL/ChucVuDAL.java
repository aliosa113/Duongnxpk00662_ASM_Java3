/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.ChucVu;
import java.sql.ResultSet;

/**
 *
 * @author Dương Nguyễn
 */
public class ChucVuDAL {
    
    //Hàm thực hiện câu truy vấn THÊM chức vụ
    public static void CauTruyVanThemChucVu(ChucVu CV){
        String SQLThem = "insert into ChucVu values (N'"+CV.getTenChucVu()+"',N'"+CV.getMoTa()+"')";
        ConnectionDB.ExcuteQueryUpdateDB(SQLThem);
    }
    
    //Hàm thực hiện câu truy vấn SỬA chức vụ
    public static void CauTruyVanSuaChucVu(ChucVu CV){
        String SQLSua = "update ChucVu set TenChucVu = N'"+CV.getTenChucVu()+"',"
                + " MoTa = N'"+CV.getMoTa()+"' where MaChucVu = "+ CV.getMaChucVu();
        ConnectionDB.ExcuteQueryUpdateDB(SQLSua);
    }
    
    //Hàm thực hiện câu truy vấn XÓA chức vụ
    public static void CauTruyVanXoaChucVu(String MaChucVu){
        String SQLXoa = "delete from ChucVu where MaChucVu = "+ MaChucVu;
        ConnectionDB.ExcuteQueryUpdateDB(SQLXoa);
    }
    
    //Hàm thực hiện câu truy vấn SELECT chức vụ
    public static ResultSet CauTruyVanLayThongTinChucVu(){
        ResultSet rs;
        String SQLSelect = "select * from ChucVu";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }
    
    //Hàm thực hiện câu truy vấn TÌM chức vụ
    public static ResultSet CauTruyVanTimChucVu(String Search){
        ResultSet rs;
        String SQLTim = "select * from ChucVu where TenChucVu like N'%"+Search+"%' or MoTa like N'%"+Search+"%'";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLTim);
        return rs;
    }
}
