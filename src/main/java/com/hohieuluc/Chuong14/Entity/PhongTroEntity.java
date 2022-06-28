package com.hohieuluc.Chuong14.Entity;

public class PhongTroEntity {
    private long id;
    private long phongId;
    private String maPhong;
    private String tenPhong;
    private double giaThang;
    private double giaDien;
    private double giaNuoc;
    private long trangThai;

    public PhongTroEntity(long id, long phongId, String maPhong, String tenPhong, double giaThang, double giaDien,
            double giaNuoc, long trangThai) {
        this.id = id;
        this.phongId = phongId;
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.giaThang = giaThang;
        this.giaDien = giaDien;
        this.giaNuoc = giaNuoc;
        this.trangThai = trangThai;
    }

    public PhongTroEntity(long phongId, String maPhong, String tenPhong, double giaThang, double giaDien,
            double giaNuoc, long trangThai) {
        this.phongId = phongId;
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.giaThang = giaThang;
        this.giaDien = giaDien;
        this.giaNuoc = giaNuoc;
        this.trangThai = trangThai;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPhongId() {
        return phongId;
    }

    public void setPhongId(long phongId) {
        this.phongId = phongId;
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

    public double getGiaThang() {
        return giaThang;
    }

    public void setGiaThang(double giaThang) {
        this.giaThang = giaThang;
    }

    public double getGiaDien() {
        return giaDien;
    }

    public void setGiaDien(double giaDien) {
        this.giaDien = giaDien;
    }

    public double getGiaNuoc() {
        return giaNuoc;
    }

    public void setGiaNuoc(double giaNuoc) {
        this.giaNuoc = giaNuoc;
    }

    public long getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(long trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "Phong tro id:" + id
                + ", phongId: " + phongId
                + ", maPhong: " + maPhong
                + ", tenPhong: " + tenPhong
                + ", giaThang: " + giaThang
                + ", giaDien: " + giaDien
                + ", giaNuoc: " + giaNuoc
                + ", trangThai: " + trangThai;
    }

}
