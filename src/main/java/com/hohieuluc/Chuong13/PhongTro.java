package com.hohieuluc.Chuong13;

public class PhongTro implements Comparable<PhongTro> {
    private String tenPhong;
    private int giaThue;
    private boolean conTrong;

    public PhongTro(String tenPhong, int giaThue, boolean conTrong) {
        this.tenPhong = tenPhong;
        this.giaThue = giaThue;
        this.conTrong = conTrong;
    }

    @Override
    public int compareTo(PhongTro phongTro) {
        return this.tenPhong.compareTo(phongTro.getTenPhong());
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public boolean isConTrong() {
        return conTrong;
    }

    public void setConTrong(boolean conTrong) {
        this.conTrong = conTrong;
    }

    public int getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(int giaThue) {
        this.giaThue = giaThue;
    }

    @Override
    public String toString() {
        return "Phong: " + tenPhong
                + ", gia: " + giaThue + "VND"
                + ", tinh trang: " + (conTrong ? "trong" : "da co nguoi");
    }
}
