package com.hohieuluc.Chuong12;

public abstract class Phong {
    private String ten;
    private boolean conTrong;
    private HopDong hopDong;
    private HoaDon hoaDon;

    public Phong(String ten, boolean conTrong) {
        this.ten = ten;
        this.conTrong = conTrong;
        this.hopDong = null;
        this.hoaDon = null;
    }

    public abstract void thuePhong(HopDong hopDong);

    public abstract void traPhong(HoaDon hoaDon);

    public void taoHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
        this.hopDong = null;
    }

    public void taoHopDong(HopDong hopDong) {
        this.hoaDon = null;
        this.hopDong = hopDong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean isConTrong() {
        return conTrong;
    }

    public void setConTrong(boolean conTrong) {
        this.conTrong = conTrong;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public HopDong getHopDong() {
        return hopDong;
    }

    public void setHopDong(HopDong hopDong) {
        this.hopDong = hopDong;
    }
}
