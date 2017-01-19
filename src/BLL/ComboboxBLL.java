/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.ComboboxModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author DuongAli
 */
public class ComboboxBLL {
    
     /**
     * 3 hàm
     * - Load dữ liệu vào ComboBox
     * - Get Lấy dữ liệu từ ComboBox
     * - Select Chọn lại phần từ trong ComboBox
     */

    public static void LoadDuLieuCombobox(ResultSet rs, JComboBox Combobox, String TenCotHienThi, String TenCotMa) {
        DefaultComboBoxModel Combo = new DefaultComboBoxModel();
        try {
            while (rs.next()) {
                ComboboxModel item = new ComboboxModel(rs.getString(TenCotHienThi), rs.getInt(TenCotMa));
                Combo.addElement(item);
                Combobox.setModel(Combo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public static void setSelectedCombobox(JComboBox cbb, String cbbValue) {
        //Vòng lặp lấy tất cả item trong combobox
        for (int i = 0; i < cbb.getItemCount(); i++) {
            //Lấy từng giá Element trong combobox và gán vào 1 biến Object
            Object obj = cbb.getItemAt(i);
            //Nếu obj khác null
            if (obj != null) {
                //Ép kiểu obj về kiểu DisplayValueModel nhưng mình đã định nghĩa
                ComboboxModel m = (ComboboxModel) obj;
                //Nếu nội dung bằng với DisplayMember của obj thì chọn lại combobox
                if (cbbValue.equals(m.DislayMmber)) {
                    //Chọn lại combobox theo Element
                    cbb.setSelectedItem(m);
                }
            }
        }
    }

    public static String getSelectedItemID(JComboBox cbb) {
        String result;
        Object[] obj = cbb.getSelectedObjects();
        ComboboxModel item = (ComboboxModel) obj[0];
        result = item.DislayValue.toString();
        return result;
    }
}
