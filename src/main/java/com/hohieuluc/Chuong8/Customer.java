package com.hohieuluc.Chuong8;

import java.util.Scanner;

public class Customer {
    private String maKhachHang;
    private String hoTen;
    private String diaChi;
    private long doanhSo;

    public Customer() {
    }

    public Customer(String maKhachHang, String hoTen, String diaChi, long doanhSo) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.doanhSo = doanhSo;
    }

    public void nhap(Scanner scanner) {
        System.out.println("Nhap ma khach hang: ");
        this.maKhachHang = scanner.nextLine();
        System.out.println("Nhap ho ten: ");
        this.hoTen = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        this.diaChi = scanner.nextLine();
        System.out.println("Nhap doanh so: ");
        this.doanhSo = scanner.nextLong();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Ma khach hang: " + maKhachHang
                + ", ho ten: " + hoTen
                + ", dia chi: " + diaChi
                + ", doanh so: " + doanhSo;
    }

    public static Customer parseCustomerFromString(String customerString) {
        String[] customerInfo = customerString.split(", ");
        String maKhachHang = customerInfo[0].split(": ")[1];
        String hoTen = customerInfo[1].split(": ")[1];
        String diaChi = customerInfo[2].split(": ")[1];
        long doanhSo = Long.parseLong(customerInfo[3].split(": ")[1]);
        return new Customer(maKhachHang, hoTen, diaChi, doanhSo);
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public long getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(long doanhSo) {
        this.doanhSo = doanhSo;
    }
}
