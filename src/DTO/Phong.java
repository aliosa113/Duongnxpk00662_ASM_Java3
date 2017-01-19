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
public class Phong {
    private String MaPhong;
    private String MaLoai;
    private String MaTrangThai;
    private String MaTinhTrang;

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }

    public String getMaTrangThai() {
        return MaTrangThai;
    }

    public void setMaTrangThai(String MaTrangThai) {
        this.MaTrangThai = MaTrangThai;
    }

    public String getMaTinhTrang() {
        return MaTinhTrang;
    }

    public void setMaTinhTrang(String MaTinhTrang) {
        this.MaTinhTrang = MaTinhTrang;
    }

    public Phong() {
    }

    public Phong(String MaPhong, String MaLoai, String MaTrangThai, String MaTinhTrang) {
        this.MaPhong = MaPhong;
        this.MaLoai = MaLoai;
        this.MaTrangThai = MaTrangThai;
        this.MaTinhTrang = MaTinhTrang;
    }
    
}
