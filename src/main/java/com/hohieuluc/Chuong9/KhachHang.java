package com.hohieuluc.Chuong9;

public class KhachHang {
    private long id;
    private String maKhachHang;
    private String ten;
    private String diaChi;
    private long doanhSo;
    private static long lastId = 0;
    
    public KhachHang(String maKhachHang, String ten, String diaChi) {
        this.id = KhachHang.inscreaseId();
        this.maKhachHang = maKhachHang;
        this.ten = ten;
        this.diaChi = diaChi;
        this.doanhSo = 0;
    }

    public KhachHang(long id, String maKhachHang, String ten, String diaChi) {
        this.id = id;
        this.maKhachHang = maKhachHang;
        this.ten = ten;
        this.diaChi = diaChi;
        this.doanhSo = 0;
    }
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getMaKhachHang() {
        return maKhachHang;
    }
    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
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

    public void info() {
        System.out.println("id: " + this.id);
        System.out.println("ma khach hang: " + this.maKhachHang);
        System.out.println("ten: " + this.ten);
        System.out.println("dia chi: " + this.diaChi);
        System.out.println("doanh so: " + this.doanhSo);
    }

    public void muaHang(int soTien) {
        this.doanhSo += soTien;
    }

    public static long inscreaseId() {
        lastId++;
        return lastId;
    }

    public static void main(String[] args) {
        KhachHang khachHang = new KhachHang(1, "KH001", "Nguyen Van A", "HN");
        khachHang.info();
        khachHang.muaHang(10000);
        khachHang.info();
    }
}
