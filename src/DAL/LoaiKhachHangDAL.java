/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.LoaiKhachHang;
import java.sql.ResultSet;

/**
 *
 * @author DuongAli
 */
public class LoaiKhachHangDAL {
    
    //Hàm thực hiện câu truy vấn Thêm loại khách hàng
    public static void CauTruyVanThemLoaiKhachHang(LoaiKhachHang LKH){
        String SQLThem = "insert into LoaiKhachHang "
                + "values (N'"+LKH.getTenLoaiKH()+"',N'"+LKH.getMoTaLoaiKH()+"')";
        ConnectionDB.ExcuteQueryUpdateDB(SQLThem);
    }
    
    //Hàm thực hiện câu truy vấn SỬA loại khách hàng
    public static void CauTruyVanSuaLoaiKhachHang(LoaiKhachHang LKH){
        String SQLSua = "update LoaiKhachHang set"
                + " TenLoaiKH = N'"+LKH.getTenLoaiKH()+"', MoTa = N'"+LKH.getMoTaLoaiKH()+"'"
                + " where MaLoaiKH = '"+LKH.getMaLoaiKH()+"'";
        ConnectionDB.ExcuteQueryUpdateDB(SQLSua);
    }
    
    //Hàm thực hiện câu truy vấn XÓA loại khách hàng
    public static void CauTruyVanXoaLoaiKhachHang(int MaLoaiKhachHang){
        String SQlXoa = "delete from LoaiKhachHang where MaLoaiKH = "+ MaLoaiKhachHang;
        ConnectionDB.ExcuteQueryUpdateDB(SQlXoa);
    }
    
    //Hàm thực hiện câu truy vấn SELECT loại khách hàng
    public static ResultSet CauTruyVanLayThongTinLoaiKhachHang(){
        ResultSet rs;
        String SQLSelect = "Select * from LoaiKhachHang";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }
    
    //Hàm thực hiện câu truy vấn TÌM loại khách hàng theo Tên loại khách hàng và mô tả
    public static ResultSet CauTruyVanTimLoaiKhachHang(String LoaiKhachHang){
        ResultSet rs;
        String SQLTim = "select * from LoaiKhachHang where "
                + "TenLoaiKH like N'%"+LoaiKhachHang+"%' or MoTa like N'%"+LoaiKhachHang+"%'";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLTim);
        return rs;
    }
}
