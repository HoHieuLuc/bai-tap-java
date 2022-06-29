package com.hohieuluc.Chuong14.Entity;

public class ThuePhongEntity {
    private long id;
    private long phongId;
    private long giaThang;
    private long giaDiem;
    private long giaNuoc;

    public ThuePhongEntity(long id, long phongId, long giaThang, long giaDiem, long giaNuoc) {
        this.id = id;
        this.phongId = phongId;
        this.giaThang = giaThang;
        this.giaDiem = giaDiem;
        this.giaNuoc = giaNuoc;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPhongId() {
        return phongId;
    }

    public void setPhongId(long phongId) {
        this.phongId = phongId;
    }

    public long getGiaThang() {
        return giaThang;
    }

    public void setGiaThang(long giaThang) {
        this.giaThang = giaThang;
    }

    public long getGiaDiem() {
        return giaDiem;
    }

    public void setGiaDiem(long giaDiem) {
        this.giaDiem = giaDiem;
    }

    public long getGiaNuoc() {
        return giaNuoc;
    }

    public void setGiaNuoc(long giaNuoc) {
        this.giaNuoc = giaNuoc;
    }
}
