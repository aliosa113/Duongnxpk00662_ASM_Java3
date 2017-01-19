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
public class TinhTrangThietBi {
    private String MaTinhTrang;
    private String TinhTrang;

    public String getMaTinhTrang() {
        return MaTinhTrang;
    }

    public void setMaTinhTrang(String MaTinhTrang) {
        this.MaTinhTrang = MaTinhTrang;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public TinhTrangThietBi() {
    }

    public TinhTrangThietBi(String MaTinhTrang, String TinhTrang) {
        this.MaTinhTrang = MaTinhTrang;
        this.TinhTrang = TinhTrang;
    }
    
}
