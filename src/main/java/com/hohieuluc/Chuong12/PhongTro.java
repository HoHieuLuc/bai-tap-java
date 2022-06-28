package com.hohieuluc.Chuong12;

public class PhongTro extends Phong {

    public PhongTro(String ten) {
        super(ten);
    }

    @Override
    public void thuePhong(HopDong hopDong) {
        System.out.println("Lam thu tuc thue phong tro");
        System.out.println("Thue phong tro thanh cong");
        this.taoHopDong(hopDong);
    }

    @Override
    public void traPhong(HoaDon hoaDon) {
        System.out.println("Tra phong tro thanh cong");
        this.taoHoaDon(hoaDon);
    }
    
}
