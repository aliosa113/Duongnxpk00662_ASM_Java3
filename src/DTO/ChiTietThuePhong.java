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
public class ChiTietThuePhong {
    private String MaChiTietThuePhong;
    private String MaPhieuThue;
    private String MaPhong;
    private String NgayTao;
    private String MaDichVu;
    private String SoLuong;

    public String getMaChiTietThuePhong() {
        return MaChiTietThuePhong;
    }

    public void setMaChiTietThuePhong(String MaChiTietThuePhong) {
        this.MaChiTietThuePhong = MaChiTietThuePhong;
    }

    public String getMaPhieuThue() {
        return MaPhieuThue;
    }

    public void setMaPhieuThue(String MaPhieuThue) {
        this.MaPhieuThue = MaPhieuThue;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(String NgayTao) {
        this.NgayTao = NgayTao;
    }

    public String getMaDichVu() {
        return MaDichVu;
    }

    public void setMaDichVu(String MaDichVu) {
        this.MaDichVu = MaDichVu;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public ChiTietThuePhong() {
    }

    public ChiTietThuePhong(String MaChiTietThuePhong, String MaPhieuThue, String MaPhong, String NgayTao, String MaDichVu, String SoLuong) {
        this.MaChiTietThuePhong = MaChiTietThuePhong;
        this.MaPhieuThue = MaPhieuThue;
        this.MaPhong = MaPhong;
        this.NgayTao = NgayTao;
        this.MaDichVu = MaDichVu;
        this.SoLuong = SoLuong;
    }
    
}
