package com.hohieuluc.Chuong13;

import java.util.ArrayList;
import java.util.Collections;

public class NhaTro {
    private String tenNhaTro;
    private ArrayList<PhongTro> phongTros;

    public NhaTro(String tenNhaTro, ArrayList<PhongTro> phongTros) {
        this.tenNhaTro = tenNhaTro;
        this.phongTros = phongTros;
    }

    public void themPhongTro(PhongTro phongTro) {
        phongTros.add(phongTro);
    }

    public void xoaPhongTro(PhongTro phongTro) {
        phongTros.remove(phongTro);
    }

    public void xoaPhongTro(String tenPhong) {
        for (PhongTro phongTro : phongTros) {
            if (phongTro.getTenPhong().equals(tenPhong)) {
                phongTros.remove(phongTro);
                break;
            }
        }
    }

    public void capNhapPhongTro(PhongTro phongTro) {
        for (PhongTro phong : phongTros) {
            if (phong.getTenPhong().equals(phongTro.getTenPhong())) {
                phong.setGiaThue(phongTro.getGiaThue());
                phong.setConTrong(phongTro.isConTrong());
                break;
            }
        }
    }

    public void capNhapPhongTro(String tenPhong, int giaThue, boolean conTrong) {
        for (PhongTro phong : phongTros) {
            if (phong.getTenPhong().equals(tenPhong)) {
                phong.setGiaThue(giaThue);
                phong.setConTrong(conTrong);
                break;
            }
        }
    }

    public void inDanhSachPhongTro() {
        for (PhongTro phong : phongTros) {
            System.out.println(phong.toString());
        }
    }

    public void inDanhSachPhongTroChuaThue() {
        for (PhongTro phong : phongTros) {
            if (phong.isConTrong()) {
                System.out.println(phong.toString());
            }
        }
    }

    public void sortPhongTros() {
        Collections.sort(phongTros);
    }

    public String getTenNhaTro() {
        return tenNhaTro;
    }

    public void setTenNhaTro(String tenNhaTro) {
        this.tenNhaTro = tenNhaTro;
    }

    public ArrayList<PhongTro> getPhongTros() {
        return phongTros;
    }

    public void setPhongTros(ArrayList<PhongTro> phongTros) {
        this.phongTros = phongTros;
    }
}
