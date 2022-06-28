package com.hohieuluc.Chuong12;

public abstract class Nha {
    private DiaDiem diaDiem;
    private String ten;

    public Nha(DiaDiem diaDiem, String ten) {
        this.diaDiem = diaDiem;
        this.ten = ten;
    }

    public abstract void banNha();

    public DiaDiem getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(DiaDiem diaDiem) {
        this.diaDiem = diaDiem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
