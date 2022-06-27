package com.hohieuluc.Chuong4;

public class MyProfile {
    final String hoTen = "Hồ Hiểu Lực";
    final String ngaySinh = "01/01/2000";

    String diaChi = "Nha Trang, Khánh Hòa";
    long soDienThoai = 123456789;

    public void myInfo() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Số điện thoại: " + soDienThoai);
    }

    public static void main(String[] args) {
        MyProfile myProfile = new MyProfile();
        myProfile.myInfo();
    }
}
