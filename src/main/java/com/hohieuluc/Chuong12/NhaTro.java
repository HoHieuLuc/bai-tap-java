package com.hohieuluc.Chuong12;

public class NhaTro extends Nha {

    public NhaTro(DiaDiem diaDiem, String ten) {
        super(diaDiem, ten);
    }
    

    @Override
    public void banNha() {
        System.out.println("Lam thu tuc ban nha tro");
        System.out.println("Ban nha tro thanh cong");
    }
    
}
