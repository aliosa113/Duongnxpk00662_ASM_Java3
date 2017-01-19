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
public class ComboboxModel {

    public Object DislayMmber;
    public Object DislayValue;

    public ComboboxModel(Object Member, Object value) {
        DislayMmber = Member;
        DislayValue = value;
    }

    @Override
    public String toString() {
        return DislayMmber.toString();
    }
}
