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
public class PhieuThuePhong {
    private String MaPhieuThue;
    private String MaTaiKhoan;
    private String MaHoaDon;

    public String getMaPhieuThue() {
        return MaPhieuThue;
    }

    public void setMaPhieuThue(String MaPhieuThue) {
        this.MaPhieuThue = MaPhieuThue;
    }

    public String getMaTaiKhoan() {
        return MaTaiKhoan;
    }

    public void setMaTaiKhoan(String MaTaiKhoan) {
        this.MaTaiKhoan = MaTaiKhoan;
    }

    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public PhieuThuePhong() {
    }

    public PhieuThuePhong(String MaPhieuThue, String MaTaiKhoan, String MaHoaDon) {
        this.MaPhieuThue = MaPhieuThue;
        this.MaTaiKhoan = MaTaiKhoan;
        this.MaHoaDon = MaHoaDon;
    }
    
}
