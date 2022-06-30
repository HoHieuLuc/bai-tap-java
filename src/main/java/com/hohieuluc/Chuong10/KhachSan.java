package com.hohieuluc.Chuong10;

import java.util.ArrayList;

public class KhachSan extends Nha<PhongKhachSan> {

    public KhachSan(String diaChi, String ten) {
        super(diaChi, ten);
        this.setDanhSachPhong(new ArrayList<PhongKhachSan>() {
            {
                add(new PhongKhachSan(
                        "Phong 10001", 100, 100000, true,
                        null, "May quat, may lanh, tv"));
                add(new PhongKhachSan(
                        "Phong 10002", 100, 200000, true,
                        null, "May lanh, tv"));
                add(new PhongKhachSan(
                        "Phong 20001", 100, 250000, true,
                        null, "May quat, tv, tu lanh"));
            }
        });
    }

}
