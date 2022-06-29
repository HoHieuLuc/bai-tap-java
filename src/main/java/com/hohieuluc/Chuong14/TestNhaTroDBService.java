package com.hohieuluc.Chuong14;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

import com.hohieuluc.Chuong14.Entity.PhongEntity;

public class TestNhaTroDBService {
    public static void main(String[] args) throws SQLException {
        NhaTroDBService nhaTroDBService = new NhaTroDBService();

        nhaTroDBService.themPhong(new PhongEntity("P001", "Phòng 1",
                "THUONG", 100, 1));
        nhaTroDBService.themPhong(new PhongEntity("P002", "Phòng 2",
                "THUONG", 50, 1));
        nhaTroDBService.themPhong(new PhongEntity("P003", "Phòng 3",
                "THUONG", 120, 1));

        ArrayList<PhongEntity> tatCaPhong = nhaTroDBService.getPhong();

        for (PhongEntity phong : tatCaPhong) {
            System.out.println(phong.toString());
        }

        nhaTroDBService.capNhatTrangThai("P001", 2);
        nhaTroDBService.capNhatTrangThai("P002", 3);

        ArrayList<PhongEntity> phongChuaThue = nhaTroDBService.getPhong(1);

        for (PhongEntity phong : phongChuaThue) {
            System.out.println(phong.toString());
        }

        Collections.sort(tatCaPhong);

        for (PhongEntity phong : tatCaPhong) {
            System.out.println(phong.toString());
        }

        ConnectDB.close();
    }
}
