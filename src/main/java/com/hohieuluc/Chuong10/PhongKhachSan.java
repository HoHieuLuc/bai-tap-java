package com.hohieuluc.Chuong10;

public class PhongKhachSan extends Phong {
    private String tienNghi;

    public PhongKhachSan(String tenPhong, double dienTich, int giaThue, boolean conTrong, KhachHang nguoiThue,
            String tienNghi) {
        super(tenPhong, dienTich, giaThue, conTrong, nguoiThue);
        this.tienNghi = tienNghi;
    }

    public String getTienNghi() {
        return tienNghi;
    }

    public void setTienNghi(String tienNghi) {
        this.tienNghi = tienNghi;
    }

    @Override
    public String toString() {
        return super.toString() + ", tien nghi: " + tienNghi;
    }

}
