package com.hohieuluc.Chuong10;

public class Main {
    public static void main(String[] args) {
        KhachHang khachHangNguyenVanA = new KhachHang(
                "Nguyen Van A",
                "0123456789",
                "HN");
        KhachHang khachHangLeThiB = new KhachHang(
                "Le Thi B",
                "0987654321",
                "HCM");
        
        System.out.println(khachHangNguyenVanA.toString());
        System.out.println(khachHangLeThiB.toString());

        KhachSan khachSanMuongThanh = new KhachSan("123 duong ABC", "Khach san Muong Thanh");
        NhaTro nhaTroBinhDan = new NhaTro("456 duong XYZ", "Nha tro Binh Dan");

        khachSanMuongThanh.inDanhSachPhong();
        nhaTroBinhDan.inDanhSachPhong();

        khachSanMuongThanh.thuePhong("Phong 10001", khachHangNguyenVanA);
        khachSanMuongThanh.inDanhSachPhong();

        khachSanMuongThanh.traPhong("Phong 10001");
        khachSanMuongThanh.inDanhSachPhong();
        
    }
}
