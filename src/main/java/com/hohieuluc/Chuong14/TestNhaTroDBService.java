package com.hohieuluc.Chuong14;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

import com.hohieuluc.Chuong14.Entity.PhongEntity;

public class TestNhaTroDBService {
    public static void main(String[] args) throws SQLException {
        NhaTroDBService nhaTroDBService = new NhaTroDBService();

        nhaTroDBService.themPhong(new PhongEntity(
                "P001", "Phòng 1", "THUONG", 100, 1));
        nhaTroDBService.themPhong(new PhongEntity(
                "P002", "Phòng 2", "THUONG", 200, 1));
        nhaTroDBService.themPhong(new PhongEntity(
                "P003", "Phòng 3", "VIP", 300, 1));

        ArrayList<PhongEntity> phongTros = nhaTroDBService.getPhong();
        for (PhongEntity phongTro : phongTros) {
            System.out.println(phongTro.toString());
        }

        nhaTroDBService.capNhatTrangThai("P001", 2);
        nhaTroDBService.capNhatTrangThai("P002", 3);

        ArrayList<PhongEntity> phongChuaChoThue = nhaTroDBService.getPhong(1);
        for (PhongEntity phongTro : phongChuaChoThue) {
            System.out.println(phongTro.toString());
        }

        Collections.sort(phongTros);
        for (PhongEntity phongTro : phongTros) {
            System.out.println(phongTro.toString());
        }

        ConnectDB.close();
    }
}
