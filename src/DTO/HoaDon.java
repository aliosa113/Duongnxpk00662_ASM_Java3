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
public class HoaDon {
    private String MaHoaDon;
    private String NgayThanhToan;
    private String TongTien;
    private String MaPhieuThue;
    private String MaKhachHang;
    private String MaTaiKhoan;

    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public String getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(String NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    public String getTongTien() {
        return TongTien;
    }

    public void setTongTien(String TongTien) {
        this.TongTien = TongTien;
    }

    public String getMaPhieuThue() {
        return MaPhieuThue;
    }

    public void setMaPhieuThue(String MaPhieuThue) {
        this.MaPhieuThue = MaPhieuThue;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getMaTaiKhoan() {
        return MaTaiKhoan;
    }

    public void setMaTaiKhoan(String MaTaiKhoan) {
        this.MaTaiKhoan = MaTaiKhoan;
    }

    public HoaDon() {
    }

    public HoaDon(String MaHoaDon, String NgayThanhToan, String TongTien, String MaPhieuThue, String MaKhachHang, String MaTaiKhoan) {
        this.MaHoaDon = MaHoaDon;
        this.NgayThanhToan = NgayThanhToan;
        this.TongTien = TongTien;
        this.MaPhieuThue = MaPhieuThue;
        this.MaKhachHang = MaKhachHang;
        this.MaTaiKhoan = MaTaiKhoan;
    }
    
}
