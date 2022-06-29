package com.hohieuluc.Chuong14.Entity;

public class PhongEntity implements Comparable<PhongEntity> {
    private long id;
    private String maPhong;
    private String tenPhong;
    private String loaiPhong;
    private double dienTich;
    private long trangThai;

    public PhongEntity(String maPhong, String tenPhong, String loaiPhong, double dienTich, long trangThai) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.loaiPhong = loaiPhong;
        this.dienTich = dienTich;
        this.trangThai = trangThai;
    }

    public PhongEntity(long id, String maPhong, String tenPhong, String loaiPhong, double dienTich, long trangThai) {
        this.id = id;
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.loaiPhong = loaiPhong;
        this.dienTich = dienTich;
        this.trangThai = trangThai;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
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

    public long getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(long trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "Phong id: " + id
                + ", ma phong: " + maPhong
                + ", ten phong: " + tenPhong
                + ", dien tich: " + dienTich
                + ", loai phong: " + loaiPhong
                + ", trang thai: " + trangThai;
    }

    @Override
    public int compareTo(PhongEntity o) {
        return this.maPhong.compareTo(o.maPhong);
    }

}
