/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.NhanVienDAL;
import DTO.NhanVien;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dương Nguyễn
 */
public class NhanVienBLL {
    //Hàm Kiểm Tra

    public static boolean KiemTraNhanVien(NhanVien KH, JLabel lblThongBao) {
        boolean KetQua = true;

//        if (KH.getTenNhanVien().equals("") && KH.getNgaySinh().equals("") && KH.getDiaChi().equals("") && KH.getSoCMND().equals("")
//                && KH.getSDT().equals("") && KH.getEmail().equals("")) {
//            lblThongBao.setText("Không có thông tin nhân viên, xin kiểm tra lại thông tin!");
//            lblThongBao.setForeground(new Color(255, 51, 51));
//            return false;
//        } else if (KH.getTenNhanVien().equals("")) {
//            lblThongBao.setText("Tên nhân viên không được để trống!");
//            lblThongBao.setForeground(new Color(255, 51, 51));
//            return false;
//        } else if (KH.getTenNhanVien().length() < 6) {
//            lblThongBao.setText("Tên nhân viên không được nhỏ hơn 6 ký tự");
//            lblThongBao.setForeground(new Color(255, 51, 51));
//            return false;
//        } else if (KH.getNgaySinh().equals("")) {
//            lblThongBao.setText("Ngày tháng năm sinh không được để trống!");
//            lblThongBao.setForeground(new Color(255, 51, 51));
//            return false;
//        } else if (KH.getDiaChi().equals("")) {
//            lblThongBao.setText("Địa chỉ không được để trống!");
//            lblThongBao.setForeground(new Color(255, 51, 51));
//            return false;
//        } else if (KH.getSoCMND().equals("")) {
//            lblThongBao.setText("Số chứng minh thư không được để trống!");
//            lblThongBao.setForeground(new Color(255, 51, 51));
//            return false;
//        } else if (KH.getSoCMND().length() < 10 || KH.getSoCMND().length() > 11) {
//            lblThongBao.setText("Số chứng minh thư từ 10 - 11");
//            lblThongBao.setForeground(new Color(255, 51, 51));
//            return false;
//        } else if (!KH.getSDT().equals("") && KH.getSDT().length() < 9 || KH.getSDT().length() > 11) {
//            lblThongBao.setText("Số điện thoại phải từ 9 đến 11 số! Nếu không có SĐT bạn có thể để trống!");
//            lblThongBao.setForeground(new Color(255, 51, 51));
//            return false;
//        } else {
//            lblThongBao.setText("Khách hàng được cập nhật thành công! Nếu thông tin nhập sai, bạn có thể sửa lại!");
//            lblThongBao.setForeground(new Color(0, 51, 255));
//        }

        return KetQua;
    }

    //Hàm đổ dữ liệu vào table Nhân Viên
    public static void DoDuLieuVaoJTableNhanVien(ResultSet rs, JTable Jtable) {
        Object[] objs = new Object[]{"Mã Nhân Viên", "Tên Nhân Viên", "Giới Tính", "Ngày Sinh",
            "Địa Chỉ", "Số CMND", "Số Điện Thoại", "Email", "Chức Vụ", "Ngày Vào Làm", "Lương"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        Jtable.setModel(tableModel);

        try {
            while (rs.next()) {
                Object[] item = new Object[11];

                item[0] = rs.getString("MaNhanVien");
                item[1] = rs.getString("TenNhanVien");
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
                item[8] = NhanVienDAL.LayTenChucVuDuaVaoMaChucVu(rs.getString("MaChucVu"));
                item[9] = rs.getString("NgayVaoLam");
                item[10] = rs.getString("Luong");

                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi DoDuLieuVaoJTable\n" + ex.toString());
        }
    }

    //Dữ liệu Nhân Viên
    public static ResultSet DuLieuNhanVien() {
        ResultSet rs;
        rs = NhanVienDAL.CauTruyVanLayThongTinNhanVien();
        return rs;
    }

    //Hàm Kiểm tra và thêm mới nhân viên
    public static void ThemNhanVien(NhanVien KH, JLabel lblThongBao) {
        boolean KetQua = KiemTraNhanVien(KH, lblThongBao);
        if (KetQua) {
            NhanVienDAL.CauTruyVanThemNhanVien(KH);
        }
    }

    //Hàm kiểm tra va sửa thông tin nhân viên
    public static void SuaNhanVien(NhanVien KH, JLabel lblThongBao) {
        boolean KetQua = KiemTraNhanVien(KH, lblThongBao);
        if (KetQua) {
            NhanVienDAL.CauTruyVanSuaNhanVien(KH);
        }
    }

    //Hàm xóa thông tin nhân viên
    public static void XoaNhanVien(String MaNhanVien, JLabel lblThongBao) {
        if (!MaNhanVien.equals("")) {
            NhanVienDAL.CauTruyVanXoaNhanVien(MaNhanVien);
            lblThongBao.setText("Tất cả các nhân viên được chọn đã được xóa thành công!");
            lblThongBao.setForeground(new Color(0, 51, 255));
        }
    }

    //Hàm tìm nhân viên
    public static ResultSet TimNhanVien(String Search) {
        ResultSet rs;
        rs = NhanVienDAL.CauTruyVanTimNhanVien(Search);
        return rs;
    }
}
