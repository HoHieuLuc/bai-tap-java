package com.hohieuluc.Chuong12;

public class KhachSan extends Nha {

    public KhachSan(DiaDiem diaDiem, String ten) {
        super(diaDiem, ten);
    }

    @Override
    public void banNha() {
        System.out.println("Lam thu tuc ban khach san");
        System.out.println("Chuyen nhuong cac thu");
        System.out.println("Ban khach san thanh cong");
    }
    
}
