/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.ChucVuDAL;
import java.sql.ResultSet;

/**
 *
 * @author Dương Nguyễn
 */
public class ChucVuBLL {

    public static ResultSet DuLieuChucVu() {
        ResultSet rs;
        rs = ChucVuDAL.CauTruyVanLayThongTinChucVu();
        return rs;
    }
}
