/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.LoaiKhachHangDAL;
import java.sql.ResultSet;

/**
 *
 * @author DuongAli
 */
public class LoaiKhachHangBLL {

    public static ResultSet DuLieuLoaiKhachHang() {
        ResultSet rs;
        rs = LoaiKhachHangDAL.CauTruyVanLayThongTinLoaiKhachHang();
        return rs;
    }
}
