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
public class TrangThaiPhong {
    private String MaTrangThaiPhong;
    private String TrangThai;

    public String getMaTrangThaiPhong() {
        return MaTrangThaiPhong;
    }

    public void setMaTrangThaiPhong(String MaTrangThaiPhong) {
        this.MaTrangThaiPhong = MaTrangThaiPhong;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public TrangThaiPhong() {
    }

    public TrangThaiPhong(String MaTrangThaiPhong, String TrangThai) {
        this.MaTrangThaiPhong = MaTrangThaiPhong;
        this.TrangThai = TrangThai;
    }
    
}
