package com.hohieuluc.Chuong14.Entity;

public class PhongEntity {
    private long id;
    private String loaiPhong;
    private double dienTich;

    public PhongEntity(long id, String loaiPhong, double dienTich) {
        this.id = id;
        this.loaiPhong = loaiPhong;
        this.dienTich = dienTich;
    }

    public PhongEntity(String loaiPhong, double dienTich) {
        this.loaiPhong = loaiPhong;
        this.dienTich = dienTich;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    @Override
    public String toString() {
        return "Phong id: " + id + ", loai phong: " + loaiPhong + ", dien tich: " + dienTich;
    }
}
