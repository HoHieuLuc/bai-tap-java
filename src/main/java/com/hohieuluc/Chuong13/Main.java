package com.hohieuluc.Chuong13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NhaTro nhaTro = new NhaTro("Nha tro A", new ArrayList<PhongTro>());

        nhaTro.themPhongTro(new PhongTro("Phong 3", 300, true));
        nhaTro.themPhongTro(new PhongTro("Phong 1", 100, true));
        nhaTro.themPhongTro(new PhongTro("Phong 5", 500, true));
        nhaTro.themPhongTro(new PhongTro("Phong 4", 400, false));
        nhaTro.themPhongTro(new PhongTro("Phong 2", 200, false));
 
        nhaTro.inDanhSachPhongTro();
        System.out.println("=====================================");
        nhaTro.xoaPhongTro("Phong 2");
        nhaTro.inDanhSachPhongTro();
        System.out.println("=====================================");
        nhaTro.capNhapPhongTro("Phong 3", 5000, false);
        nhaTro.inDanhSachPhongTro();
        System.out.println("=====================================");
        nhaTro.inDanhSachPhongTroChuaThue();
        System.out.println("=====================================");
        nhaTro.sortPhongTros();
        nhaTro.inDanhSachPhongTro();
    }
}
