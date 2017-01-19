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
public class Quyen {

    private String MaQuyen;
    private String TenQuyen;
    private String MoTa;

    public String getMaQuyen() {
        return MaQuyen;
    }

    public void setMaQuyen(String MaQuyen) {
        this.MaQuyen = MaQuyen;
    }

    public String getTenQuyen() {
        return TenQuyen;
    }

    public void setTenQuyen(String TenQuyen) {
        this.TenQuyen = TenQuyen;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public Quyen(String MaQuyen, String TenQuyen, String MoTa) {
        this.MaQuyen = MaQuyen;
        this.TenQuyen = TenQuyen;
        this.MoTa = MoTa;
    }

    public Quyen() {
    }
}
