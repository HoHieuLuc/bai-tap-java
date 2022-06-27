package com.hohieuluc.Chuong9;

public class MainApp {
    public static void main(String[] args) {
        KhachHang khachHangMot = new KhachHang("KH001", "Nguyen Van A", "HN");
        KhachHang khachHangHai = new KhachHang("KH002", "Nguyen Van B", "HN");
        khachHangMot.muaHang(100);
        khachHangHai.muaHang(200);
        khachHangMot.info();
        khachHangHai.info();
    }
}
