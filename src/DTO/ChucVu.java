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
public class ChucVu {
    private String MaChucVu;
    private String TenChucVu;
    private String MoTa;

    public String getMaChucVu() {
        return MaChucVu;
    }

    public void setMaChucVu(String MaChucVu) {
        this.MaChucVu = MaChucVu;
    }

    public String getTenChucVu() {
        return TenChucVu;
    }

    public void setTenChucVu(String TenChucVu) {
        this.TenChucVu = TenChucVu;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public ChucVu() {
    }

    public ChucVu(String MaChucVu, String TenChucVu, String MoTa) {
        this.MaChucVu = MaChucVu;
        this.TenChucVu = TenChucVu;
        this.MoTa = MoTa;
    }
    
    
}
