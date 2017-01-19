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
public class TrangThietBi {
    private String MaThietBi;
    private String TenThietBi;
    private String MoTa;
    private String MaTinhTrang;

    public String getMaThietBi() {
        return MaThietBi;
    }

    public void setMaThietBi(String MaThietBi) {
        this.MaThietBi = MaThietBi;
    }

    public String getTenThietBi() {
        return TenThietBi;
    }

    public void setTenThietBi(String TenThietBi) {
        this.TenThietBi = TenThietBi;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getMaTinhTrang() {
        return MaTinhTrang;
    }

    public void setMaTinhTrang(String MaTinhTrang) {
        this.MaTinhTrang = MaTinhTrang;
    }

    public TrangThietBi() {
    }

    public TrangThietBi(String MaThietBi, String TenThietBi, String MoTa, String MaTinhTrang) {
        this.MaThietBi = MaThietBi;
        this.TenThietBi = TenThietBi;
        this.MoTa = MoTa;
        this.MaTinhTrang = MaTinhTrang;
    }
    
}
