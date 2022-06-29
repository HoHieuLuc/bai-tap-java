package com.hohieuluc.Chuong10;

public class KhachHang {
    private long maKhachHang;
    private String tenKhachHang;
    private String soDienThoai;
    private String diaChi;
    private static long lastId = 0;

    public KhachHang(String tenKhachHang, String soDienThoai, String diaChi) {
        this.maKhachHang = KhachHang.inscreaseId();
        this.tenKhachHang = tenKhachHang;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
    }

    public static long inscreaseId() {
        return lastId++;
    }

    public long getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(long maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "KhachHang [diaChi=" + diaChi + ", maKhachHang=" + maKhachHang + ", soDienThoai=" + soDienThoai
                + ", tenKhachHang=" + tenKhachHang + "]";
    }
}
