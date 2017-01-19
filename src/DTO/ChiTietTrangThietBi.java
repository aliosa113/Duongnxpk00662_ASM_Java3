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
public class ChiTietTrangThietBi {
    private String MaChiTiet;
    private String MaThietBi;
    private String MaLoaiPhong;
    private String SoLuong;

    public String getMaChiTiet() {
        return MaChiTiet;
    }

    public void setMaChiTiet(String MaChiTiet) {
        this.MaChiTiet = MaChiTiet;
    }

    public String getMaThietBi() {
        return MaThietBi;
    }

    public void setMaThietBi(String MaThietBi) {
        this.MaThietBi = MaThietBi;
    }

    public String getMaLoaiPhong() {
        return MaLoaiPhong;
    }

    public void setMaLoaiPhong(String MaLoaiPhong) {
        this.MaLoaiPhong = MaLoaiPhong;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public ChiTietTrangThietBi() {
    }

    public ChiTietTrangThietBi(String MaChiTiet, String MaThietBi, String MaLoaiPhong, String SoLuong) {
        this.MaChiTiet = MaChiTiet;
        this.MaThietBi = MaThietBi;
        this.MaLoaiPhong = MaLoaiPhong;
        this.SoLuong = SoLuong;
    }
    
}
