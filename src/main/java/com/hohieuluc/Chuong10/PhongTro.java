package com.hohieuluc.Chuong10;

public class PhongTro extends Phong {
    private int giaDien;
    private int giaNuoc;

    public PhongTro(String tenPhong, double dienTich, int giaThue,
            boolean conTrong, KhachHang nguoiThue, int giaDien, int giaNuoc) {
        super(tenPhong, dienTich, giaThue, conTrong, nguoiThue);
        this.giaDien = giaDien;
        this.giaNuoc = giaNuoc;
    }

    public int getGiaDien() {
        return giaDien;
    }

    public void setGiaDien(int giaDien) {
        this.giaDien = giaDien;
    }

    public int getGiaNuoc() {
        return giaNuoc;
    }

    public void setGiaNuoc(int giaNuoc) {
        this.giaNuoc = giaNuoc;
    }

    @Override
    public String toString() {
        return super.toString() + ", gia dien: " + giaDien + ", gia nuoc: " + giaNuoc;
    }

}
