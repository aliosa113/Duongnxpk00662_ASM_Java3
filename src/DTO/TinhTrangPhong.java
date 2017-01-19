/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Dương Nguyễn
 */
public class TinhTrangPhong {
    private String MaTinhTrangPhong;
    private String TinhTrang;

    public String getMaTinhTrangPhong() {
        return MaTinhTrangPhong;
    }

    public void setMaTinhTrangPhong(String MaTinhTrangPhong) {
        this.MaTinhTrangPhong = MaTinhTrangPhong;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public TinhTrangPhong() {
    }

    public TinhTrangPhong(String MaTinhTrangPhong, String TinhTrang) {
        this.MaTinhTrangPhong = MaTinhTrangPhong;
        this.TinhTrang = TinhTrang;
    }
    
}
