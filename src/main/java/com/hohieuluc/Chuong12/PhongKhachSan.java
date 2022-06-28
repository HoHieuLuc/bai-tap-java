package com.hohieuluc.Chuong12;

import java.util.ArrayList;

public class PhongKhachSan extends Phong implements CoHangHoa {
    private String tienNghi;
    private ArrayList<HangHoa> hangHoas;

    public PhongKhachSan(String ten, String tienNghi) {
        super(ten);
        this.tienNghi = tienNghi;
        this.hangHoas = new ArrayList<>();
    }

    @Override
    public void thuePhong(HopDong hopDong) {
        System.out.println("Dat phong truoc");
        System.out.println("Lam thu tuc thue phong khach san");
        System.out.println("Thue phong khach san thanh cong");
        this.taoHopDong(hopDong);
    }

    @Override
    public void traPhong(HoaDon hoaDon) {
        System.out.println("Lam thu tuc tra phong khach san");
        System.out.println("Tra phong khach san thanh cong");
        this.taoHoaDon(hoaDon);
    }

    public String getTienNghi() {
        return tienNghi;
    }

    public void setTienNghi(String tienNghi) {
        this.tienNghi = tienNghi;
    }

    @Override
    public void themHangHoa(HangHoa hangHoa) {
        hangHoas.add(hangHoa);
    }

    @Override
    public void xoaHangHoa(HangHoa hangHoa) {
        hangHoas.remove(hangHoa);
    }

    public ArrayList<HangHoa> getHangHoas() {
        return hangHoas;
    }

    public void setHangHoas(ArrayList<HangHoa> hangHoas) {
        this.hangHoas = hangHoas;
    }

}
