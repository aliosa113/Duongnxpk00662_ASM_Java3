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
public class PhieuDatPhong {
    private String MaPhieuDat;
    private String MaPhieuThue;
    private String MaKhachHang;
    private String NgayThuePhong;
    private String NgayTraPhong;
    private String TienDatCoc;
    private String MaTaiKhoan;
    private String TinhTrang;
    private String SoNguoi;

    public String getMaPhieuDat() {
        return MaPhieuDat;
    }

    public void setMaPhieuDat(String MaPhieuDat) {
        this.MaPhieuDat = MaPhieuDat;
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

    public String getNgayThuePhong() {
        return NgayThuePhong;
    }

    public void setNgayThuePhong(String NgayThuePhong) {
        this.NgayThuePhong = NgayThuePhong;
    }

    public String getNgayTraPhong() {
        return NgayTraPhong;
    }

    public void setNgayTraPhong(String NgayTraPhong) {
        this.NgayTraPhong = NgayTraPhong;
    }

    public String getTienDatCoc() {
        return TienDatCoc;
    }

    public void setTienDatCoc(String TienDatCoc) {
        this.TienDatCoc = TienDatCoc;
    }

    public String getMaTaiKhoan() {
        return MaTaiKhoan;
    }

    public void setMaTaiKhoan(String MaTaiKhoan) {
        this.MaTaiKhoan = MaTaiKhoan;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getSoNguoi() {
        return SoNguoi;
    }

    public void setSoNguoi(String SoNguoi) {
        this.SoNguoi = SoNguoi;
    }

    public PhieuDatPhong() {
    }

    public PhieuDatPhong(String MaPhieuDat, String MaPhieuThue, String MaKhachHang, String NgayThuePhong, String NgayTraPhong, String TienDatCoc, String MaTaiKhoan, String TinhTrang, String SoNguoi) {
        this.MaPhieuDat = MaPhieuDat;
        this.MaPhieuThue = MaPhieuThue;
        this.MaKhachHang = MaKhachHang;
        this.NgayThuePhong = NgayThuePhong;
        this.NgayTraPhong = NgayTraPhong;
        this.TienDatCoc = TienDatCoc;
        this.MaTaiKhoan = MaTaiKhoan;
        this.TinhTrang = TinhTrang;
        this.SoNguoi = SoNguoi;
    }
    
}
