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
public class DichVu {
    private String MaDichVu;
    private String TenDichVu;
    private String Gia;

    public String getMaDichVu() {
        return MaDichVu;
    }

    public void setMaDichVu(String MaDichVu) {
        this.MaDichVu = MaDichVu;
    }

    public String getTenDichVu() {
        return TenDichVu;
    }

    public void setTenDichVu(String TenDichVu) {
        this.TenDichVu = TenDichVu;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String Gia) {
        this.Gia = Gia;
    }

    public DichVu() {
    }

    public DichVu(String MaDichVu, String TenDichVu, String Gia) {
        this.MaDichVu = MaDichVu;
        this.TenDichVu = TenDichVu;
        this.Gia = Gia;
    }
    
}
