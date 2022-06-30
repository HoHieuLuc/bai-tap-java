package com.hohieuluc.Chuong10;

import java.util.ArrayList;

public class NhaTro extends Nha<PhongTro> {

    public NhaTro(String diaChi, String ten) {
        super(diaChi, ten);
        this.setDanhSachPhong(new ArrayList<PhongTro>() {
            {
                add(new PhongTro(
                        "Phong 1", 100, 100000, true,
                        null, 100000, 100000));
                add(new PhongTro(
                        "Phong 2", 100, 200000, true,
                        null, 250000, 100000));
            }
        });
    }
}
