package com.hohieuluc.Chuong10;

import java.util.ArrayList;

public class Nha<T extends Phong> {
    private String ten;
    private String diaChi;
    private ArrayList<T> danhSachPhong;

    public Nha(String diaChi, String ten) {
        this.diaChi = diaChi;
        this.ten = ten;
    }

    public void thuePhong(String tenPhong, KhachHang nguoiThue) {
        for (T phong : danhSachPhong) {
            if (phong.getTenPhong().equals(tenPhong)) {
                phong.setNguoiThue(nguoiThue);
                phong.setConTrong(false);
                break;
            }
        }
    }

    public void themPhong(T phong) {
        danhSachPhong.add(phong);
    }

    public void xoaPhong(String tenPhong) {
        for (T phong : danhSachPhong) {
            if (phong.getTenPhong().equals(tenPhong)) {
                danhSachPhong.remove(phong);
                break;
            }
        }
    }

    public void traPhong(String tenPhong) {
        for (T phong : danhSachPhong) {
            if (phong.getTenPhong().equals(tenPhong)) {
                phong.setNguoiThue(null);
                phong.setConTrong(true);
                break;
            }
        }
    }

    public void inDanhSachPhong() {
        System.out.println("Danh sach phong cua " + ten);
        for (T phong : danhSachPhong) {
            System.out.println(phong.toString());
        }
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public ArrayList<T> getDanhSachPhong() {
        return danhSachPhong;
    }

    public void setDanhSachPhong(ArrayList<T> danhSachPhong) {
        this.danhSachPhong = danhSachPhong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
