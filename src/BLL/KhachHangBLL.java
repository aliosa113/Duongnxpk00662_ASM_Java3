/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.KhachHangDAL;
import DTO.KhachHang;
import java.awt.Button;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DuongAli
 */
public class KhachHangBLL {

//    Hàm Thông Báo
//    static JOptionPane Jpane = new JOptionPane();
//    static void ThongBaoDialog(String NoiDungThongBao) {
//        JOptionPane.showMessageDialog(Jpane, NoiDungThongBao);
//    }
    //Hàm Kiểm Tra
    public static boolean KiemTraKhachHang(KhachHang KH, JLabel lblThongBao) {
        boolean KetQua = true;

        if (KH.getTenKhachHang().equals("") && KH.getNgaySinh().equals("") && KH.getDiaChi().equals("") && KH.getSoCMND().equals("")
                && KH.getSDT().equals("") && KH.getEmail().equals("")) {
            lblThongBao.setText("Không có thông tin khách hàng, xin kiểm tra lại thông tin!");
            lblThongBao.setForeground(new Color(255, 51, 51));
            return false;
        } else if (KH.getTenKhachHang().equals("")) {
            lblThongBao.setText("Tên khách hàng không được để trống!");
            lblThongBao.setForeground(new Color(255, 51, 51));
            return false;
        } else if (KH.getTenKhachHang().length() < 6) {
            lblThongBao.setText("Tên khách hàng không được nhỏ hơn 6 ký tự");
            lblThongBao.setForeground(new Color(255, 51, 51));
            return false;
        } else if (KH.getNgaySinh().equals("")) {
            lblThongBao.setText("Ngày tháng năm sinh không được để trống!");
            lblThongBao.setForeground(new Color(255, 51, 51));
            return false;
        } else if (KH.getDiaChi().equals("")) {
            lblThongBao.setText("Địa chỉ không được để trống!");
            lblThongBao.setForeground(new Color(255, 51, 51));
            return false;
        } else if (KH.getSoCMND().equals("")) {
            lblThongBao.setText("Số chứng minh thư không được để trống!");
            lblThongBao.setForeground(new Color(255, 51, 51));
            return false;
        } else if (KH.getSoCMND().length() < 10 || KH.getSoCMND().length() > 11) {
            lblThongBao.setText("Số chứng minh thư từ 10 - 11");
            lblThongBao.setForeground(new Color(255, 51, 51));
            return false;
        } else if (!KH.getSDT().equals("") && KH.getSDT().length() < 9 || KH.getSDT().length() > 11) {
            lblThongBao.setText("Số điện thoại phải từ 9 đến 11 số! Nếu không có SĐT bạn có thể để trống!");
            lblThongBao.setForeground(new Color(255, 51, 51));
            return false;
        } else {
            lblThongBao.setText("Khách hàng được cập nhật thành công! Nếu thông tin nhập sai, bạn có thể sửa lại!");
            lblThongBao.setForeground(new Color(0, 51, 255));
        }

        return KetQua;
    }

    //Hàm đổ dữ liệu vào table Khách Hàng
    public static void DoDuLieuVaoJTableKhachHang(ResultSet rs, JTable Jtable) {
        Object[] objs = new Object[]{"Mã Khách Hàng", "Tên Khách Hàng", "Giới Tính", "Ngày Sinh",
            "Địa Chỉ", "Số CMND", "Số Điện Thoại", "Email", "Loại KH"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        Jtable.setModel(tableModel);

        try {
            while (rs.next()) {
                Object[] item = new Object[9];

                item[0] = rs.getString("MaKH");
                item[1] = rs.getString("TenKH");
                if (rs.getInt("GioiTinh") == 1) {
                    item[2] = "Nam";
                } else {
                    item[2] = "Nữ";
                }
                item[3] = rs.getString("NgaySinh");
                item[4] = rs.getString("DiaChi");
                item[5] = rs.getString("SoCMND");
                item[6] = rs.getString("SDT");
                item[7] = rs.getString("Email");
                item[8] = KhachHangDAL.LayLoaiKhachHangDuaVaoMaKhachHang(rs.getString("MaLoaiKH"));

                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi DoDuLieuVaoJTable\n" + ex.toString());
        }
    }

    //Dữ liệu Khách Hàng
    public static ResultSet DuLieuKhachHang() {
        ResultSet rs;
        rs = KhachHangDAL.CauTruyVanLayThongTinKhachHang();
        return rs;
    }

    //Hàm Kiểm tra và thêm mới khách hàng
    public static void ThemKhachHang(KhachHang KH, JLabel lblThongBao) {
        boolean KetQua = KiemTraKhachHang(KH, lblThongBao);
        if (KetQua) {
            KhachHangDAL.CauTruyVanThemKhachHang(KH);
        }
    }

    //Hàm kiểm tra va sửa thông tin khách hàng
    public static void SuaKhachHang(KhachHang KH, JLabel lblThongBao) {
        boolean KetQua = KiemTraKhachHang(KH, lblThongBao);
        if (KetQua) {
            KhachHangDAL.CauTruyVanSuaKhachHang(KH);
        }
    }

    //Hàm xóa thông tin khách hàng
    public static void XoaKhachHang(String MaKhachHang,JLabel lblThongBao) {
        if (!MaKhachHang.equals("")) {
            KhachHangDAL.CauTruyVanXoaKhachHang(MaKhachHang);
            lblThongBao.setText("Tất cả các khách hàng được chọn đã được xóa thành công!");
            lblThongBao.setForeground(new Color(0, 51, 255));
        }
    }
    //Hàm tìm khách hàng
    public static ResultSet TimKhachHang(String Search){
        ResultSet rs;
        rs = KhachHangDAL.TimKhachHang(Search);
        return rs;
    }
}
