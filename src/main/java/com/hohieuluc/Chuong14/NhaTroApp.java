package com.hohieuluc.Chuong14;

import java.util.ArrayList;
import java.util.Collections;

import com.hohieuluc.Chuong14.Entity.PhongTroEntity;

public class NhaTroApp {
    public static void main(String[] args) {
        NhaTroDBService nhaTroDBService = new NhaTroDBService();

        nhaTroDBService.themPhongTro(new PhongTroEntity(
                1, "PT002", 100000, 100000, 100000));
        nhaTroDBService.themPhongTro(new PhongTroEntity(
                2, "PT003", 150000, 200000, 300000));
        nhaTroDBService.themPhongTro(new PhongTroEntity(
                3, "PT001", 170000, 220000, 60000));

        ArrayList<PhongTroEntity> phongTros = nhaTroDBService.getPhongTro();
        for (PhongTroEntity phongTro : phongTros) {
            System.out.println(phongTro.toString());
        }

        Collections.sort(phongTros);
        for (PhongTroEntity phongTro : phongTros) {
            System.out.println(phongTro.toString());
        }
    }
}
