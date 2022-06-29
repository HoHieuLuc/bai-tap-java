package com.hohieuluc.Chuong14.Entity;

public class PhongTroEntity implements Comparable<PhongTroEntity> {
    private long id;
    private long phongId;
    private String maPhong;
    private long giaThang;
    private long giaDien;
    private long giaNuoc;

    public PhongTroEntity(long id, long phongId, String maPhong, long giaThang, long giaDien, long giaNuoc) {
        this.id = id;
        this.phongId = phongId;
        this.maPhong = maPhong;
        this.giaThang = giaThang;
        this.giaDien = giaDien;
        this.giaNuoc = giaNuoc;
    }

    public PhongTroEntity(long phongId, String maPhong, long giaThang, long giaDien, long giaNuoc) {
        this.phongId = phongId;
        this.maPhong = maPhong;
        this.giaThang = giaThang;
        this.giaDien = giaDien;
        this.giaNuoc = giaNuoc;
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

    public long getGiaThang() {
        return giaThang;
    }

    public void setGiaThang(long giaThang) {
        this.giaThang = giaThang;
    }

    public long getGiaDien() {
        return giaDien;
    }

    public void setGiaDien(long giaDien) {
        this.giaDien = giaDien;
    }

    public long getGiaNuoc() {
        return giaNuoc;
    }

    public void setGiaNuoc(long giaNuoc) {
        this.giaNuoc = giaNuoc;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    @Override
    public String toString() {
        return "Phong tro id: " + id +
                ", phongId: " + phongId +
                ", maPhong: " + maPhong +
                ", giaThang: " + giaThang +
                ", giaDien: " + giaDien +
                ", giaNuoc: " + giaNuoc;
    }

    @Override
    public int compareTo(PhongTroEntity o) {
        return this.maPhong.compareTo(o.maPhong);
    }
}
