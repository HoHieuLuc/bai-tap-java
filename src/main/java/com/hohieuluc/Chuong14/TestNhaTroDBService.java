package com.hohieuluc.Chuong14;

import java.sql.SQLException;

public class TestNhaTroDBService {
    public static void main(String[] args) throws SQLException {
        NhaTroDBService nhaTroDBService = new NhaTroDBService();

        System.out.println(nhaTroDBService.capNhatTrangThai("P0001", 2));
        System.out.println(nhaTroDBService.getPhong(2));

        ConnectDB.close();
    }
}
