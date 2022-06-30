package com.hohieuluc.Chuong10;

public class Phong {
    private String tenPhong;
    private double dienTich;
    private int giaThue;
    private boolean conTrong;
    private KhachHang nguoiThue;

    public Phong(String tenPhong, double dienTich, int giaThue, boolean conTrong, KhachHang nguoiThue) {
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.giaThue = giaThue;
        this.conTrong = conTrong;
        this.nguoiThue = nguoiThue;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(int giaThue) {
        this.giaThue = giaThue;
    }

    public boolean isConTrong() {
        return conTrong;
    }

    public void setConTrong(boolean conTrong) {
        this.conTrong = conTrong;
    }

    public KhachHang getNguoiThue() {
        return nguoiThue;
    }

    public void setNguoiThue(KhachHang nguoiThue) {
        this.nguoiThue = nguoiThue;
    }

    @Override
    public String toString() {
        return "Phong: " + tenPhong
                + ", dien tich: " + dienTich
                + ", gia thue: " + giaThue
                + ", tinh trang: " + (conTrong ? "con trong" : "da thue")
                + (nguoiThue != null ? ", nguoi thue: " + nguoiThue.getTenKhachHang() : "");
    }
}
