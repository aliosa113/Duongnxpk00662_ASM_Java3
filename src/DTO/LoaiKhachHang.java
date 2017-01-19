/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author DuongAli
 */
public class LoaiKhachHang {
    private int MaLoaiKH;
    private String TenLoaiKH;
    private String MoTaLoaiKH;

    public int getMaLoaiKH() {
        return MaLoaiKH;
    }

    public void setMaLoaiKH(int MaLoaiKH) {
        this.MaLoaiKH = MaLoaiKH;
    }

    public String getTenLoaiKH() {
        return TenLoaiKH;
    }

    public void setTenLoaiKH(String TenLoaiKH) {
        this.TenLoaiKH = TenLoaiKH;
    }

    public String getMoTaLoaiKH() {
        return MoTaLoaiKH;
    }

    public void setMoTaLoaiKH(String MoTaLoaiKH) {
        this.MoTaLoaiKH = MoTaLoaiKH;
    }

    public LoaiKhachHang(int MaLoaiKH, String TenLoaiKH, String MoTaLoaiKH) {
        this.MaLoaiKH = MaLoaiKH;
        this.TenLoaiKH = TenLoaiKH;
        this.MoTaLoaiKH = MoTaLoaiKH;
    }

    public LoaiKhachHang() {
    }
    
}
