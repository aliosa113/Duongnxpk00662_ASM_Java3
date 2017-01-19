/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author DuongAli
 */
public class TaiKhoan {
    private int MaTaiKhoan;
    private String TenDangNhap;
    private String MatKhau;
    private String Quyen;
    private int LuotDangNhap;

    public int getMaTaiKhoan() {
        return MaTaiKhoan;
    }

    public void setMaTaiKhoan(int MaTaiKhoan) {
        this.MaTaiKhoan = MaTaiKhoan;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getQuyen() {
        return Quyen;
    }

    public void setQuyen(String Quyen) {
        this.Quyen = Quyen;
    }

    public int getLuotDangNhap() {
        return LuotDangNhap;
    }

    public void setLuotDangNhap(int LuotDangNhap) {
        this.LuotDangNhap = LuotDangNhap;
    }
    
    public TaiKhoan(){
        
    }

    public TaiKhoan(int MaTaiKhoan, String TenDangNhap, String MatKhau, String Quyen, int LuotDangNhap) {
        this.MaTaiKhoan = MaTaiKhoan;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.Quyen = Quyen;
        this.LuotDangNhap = LuotDangNhap;
    }
    
}
