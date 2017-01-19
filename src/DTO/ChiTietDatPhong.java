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
public class ChiTietDatPhong {
    private String MaChiTietPhieuDat;
    private String MaPhieuDat;
    private String MaPhong;

    public String getMaChiTietPhieuDat() {
        return MaChiTietPhieuDat;
    }

    public void setMaChiTietPhieuDat(String MaChiTietPhieuDat) {
        this.MaChiTietPhieuDat = MaChiTietPhieuDat;
    }

    public String getMaPhieuDat() {
        return MaPhieuDat;
    }

    public void setMaPhieuDat(String MaPhieuDat) {
        this.MaPhieuDat = MaPhieuDat;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public ChiTietDatPhong() {
    }

    public ChiTietDatPhong(String MaChiTietPhieuDat, String MaPhieuDat, String MaPhong) {
        this.MaChiTietPhieuDat = MaChiTietPhieuDat;
        this.MaPhieuDat = MaPhieuDat;
        this.MaPhong = MaPhong;
    }
    
}
