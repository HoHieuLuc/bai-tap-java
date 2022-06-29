package com.hohieuluc.Chuong14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.hohieuluc.Chuong14.Entity.PhongEntity;
import com.hohieuluc.Chuong14.Entity.PhongTroEntity;

public class NhaTroDBService {
    private Connection conn = null;

    public NhaTroDBService() {
        try {
            conn = ConnectDB.connect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int themPhong(PhongEntity phong) {
        try {
            String sql = "INSERT INTO phong(maPhong, tenPhong, loaiPhong, dienTich, trangThai)"
                    + " VALUES(?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, phong.getMaPhong());
            preparedStatement.setString(2, phong.getTenPhong());
            preparedStatement.setString(3, phong.getLoaiPhong());
            preparedStatement.setDouble(4, phong.getDienTich());
            preparedStatement.setLong(5, phong.getTrangThai());
            preparedStatement.executeUpdate();

            return 0;
        } catch (SQLException e) {
            return 1;
        }
    }

    public PhongEntity getPhong(String maPhong) {
        try {
            String sql = "SELECT * FROM phong WHERE maPhong = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, maPhong);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (!resultSet.next()) {
                return null;
            }

            PhongEntity phong = new PhongEntity(
                    resultSet.getLong("id"),
                    resultSet.getString("maPhong"),
                    resultSet.getString("tenPhong"),
                    resultSet.getString("loaiPhong"),
                    resultSet.getDouble("dienTich"),
                    resultSet.getLong("trangThai"));

            return phong;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<PhongEntity> getPhong() {
        ArrayList<PhongEntity> phongs = new ArrayList<>();
        try {
            String sql = "SELECT * FROM phong";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                PhongEntity phongEntity = new PhongEntity(
                        resultSet.getLong("id"),
                        resultSet.getString("maPhong"),
                        resultSet.getString("tenPhong"),
                        resultSet.getString("loaiPhong"),
                        resultSet.getDouble("dienTich"),
                        resultSet.getLong("trangThai"));
                phongs.add(phongEntity);
            }
        } catch (SQLException e) {
        }
        return phongs;
    }

    public ArrayList<PhongEntity> getPhong(int trangThai) {
        ArrayList<PhongEntity> phongs = new ArrayList<>();
        try {
            String sql = "SELECT * FROM phong WHERE trangThai = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, trangThai);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                PhongEntity phong = new PhongEntity(
                        resultSet.getLong("id"),
                        resultSet.getString("maPhong"),
                        resultSet.getString("tenPhong"),
                        resultSet.getString("loaiPhong"),
                        resultSet.getDouble("dienTich"),
                        resultSet.getLong("trangThai"));
                phongs.add(phong);
            }
        } catch (SQLException e) {
        }
        return phongs;
    }

    public int capNhatTrangThai(String maPhong, int trangThai) {
        try {
            String sql = "UPDATE phong SET trangThai = ? WHERE maPhong = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setInt(1, trangThai);
            preparedStatement.setString(2, maPhong);

            return preparedStatement.executeUpdate() == 0 ? 1 : 0;
        } catch (SQLException e) {
            return 1;
        }
    }

    public int themPhongTro(PhongTroEntity phongTro) {
        try {
            String sql = "SELECT * FROM phong WHERE id = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setLong(1, phongTro.getPhongId());

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                if (resultSet.getLong("trangThai") != 1) {
                    return 2;
                }
            }

            sql = "INSERT INTO phongtro(phongId, maPhong, giaThang, giaDien, giaNuoc)"
                    + " VALUES(?, ?, ?, ?, ?)";
            preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setLong(1, phongTro.getPhongId());
            preparedStatement.setString(2, phongTro.getMaPhong());
            preparedStatement.setDouble(3, phongTro.getGiaThang());
            preparedStatement.setDouble(4, phongTro.getGiaDien());
            preparedStatement.setDouble(5, phongTro.getGiaNuoc());

            preparedStatement.executeUpdate();
            return 0;
        } catch (Exception e) {
            return 1;
        }
    }

    public int capNhatGia(String maPhong, long giaThang, long giaDien, long giaNuoc) {
        try {
            String sql = "UPDATE phongtro SET "
                    + "giaThang = IF(? = 0, giaThang, ?), "
                    + "giaDien = IF(? = 0, giaDien, ?), "
                    + "giaNuoc = IF(? = 0, giaNuoc, ?) "
                    + "WHERE maPhong = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setLong(1, giaThang);
            preparedStatement.setLong(2, giaThang);
            preparedStatement.setLong(3, giaDien);
            preparedStatement.setLong(4, giaDien);
            preparedStatement.setLong(5, giaNuoc);
            preparedStatement.setLong(6, giaNuoc);
            preparedStatement.setString(7, maPhong);

            return preparedStatement.executeUpdate() == 0 ? 1 : 0;
        } catch (SQLException e) {
            return 1;
        }
    }

    public ArrayList<PhongTroEntity> getPhongTro() {
        ArrayList<PhongTroEntity> phongTros = new ArrayList<>();

        try {
            String sql = "SELECT * FROM phongtro";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                PhongTroEntity phongTro = new PhongTroEntity(
                        resultSet.getLong("id"),
                        resultSet.getLong("phongId"),
                        resultSet.getString("maPhong"),
                        resultSet.getLong("giaThang"),
                        resultSet.getLong("giaDien"),
                        resultSet.getLong("giaNuoc"));
                phongTros.add(phongTro);
            }
        } catch (SQLException e) {
        }

        return phongTros;
    }

    public PhongTroEntity getPhongTro(String maPhong) {
        try {
            String sql = "SELECT * FROM phongtro WHERE maPhong = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, maPhong);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (!resultSet.next()) {
                return null;
            }

            PhongTroEntity phongTro = new PhongTroEntity(
                    resultSet.getLong("id"),
                    resultSet.getLong("phongId"),
                    resultSet.getString("maPhong"),
                    resultSet.getLong("giaThang"),
                    resultSet.getLong("giaDien"),
                    resultSet.getLong("giaNuoc"));

            return phongTro;
        } catch (SQLException e) {
            return null;
        }
    }
}
