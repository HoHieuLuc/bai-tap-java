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
            String sql = "INSERT INTO phong(loaiPhong, dienTich) VALUES(?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, phong.getLoaiPhong());
            preparedStatement.setDouble(2, phong.getDienTich());

            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            return 1;
        }
    }

    public PhongEntity getPhong(long id) {
        try {
            String sql = "SELECT * FROM phong WHERE id = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (!resultSet.next()) {
                return null;
            }

            PhongEntity phongEntity = new PhongEntity(
                    resultSet.getLong("id"),
                    resultSet.getString("loaiPhong"),
                    resultSet.getDouble("dienTich"));

            return phongEntity;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<PhongEntity> getPhong() {
        try {
            String sql = "SELECT * FROM phong";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<PhongEntity> phongEntities = new ArrayList<>();

            while (resultSet.next()) {
                PhongEntity phongEntity = new PhongEntity(
                        resultSet.getLong("id"),
                        resultSet.getString("loaiPhong"),
                        resultSet.getDouble("dienTich"));
                phongEntities.add(phongEntity);
            }

            return phongEntities;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<PhongTroEntity> getPhong(int trangThai) {
        try {
            String sql = "SELECT * FROM phongTro WHERE trangThai = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, trangThai);

            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<PhongTroEntity> phongTroEntities = new ArrayList<>();

            while (resultSet.next()) {
                PhongTroEntity phongTroEntity = new PhongTroEntity(
                        resultSet.getLong("id"),
                        resultSet.getLong("phongId"),
                        resultSet.getString("maPhong"),
                        resultSet.getString("tenPhong"),
                        resultSet.getDouble("giaThang"),
                        resultSet.getDouble("giaDien"),
                        resultSet.getDouble("giaNuoc"),
                        resultSet.getInt("trangThai"));
                phongTroEntities.add(phongTroEntity);
            }

            return phongTroEntities;
        } catch (SQLException e) {
            return null;
        }
    }

    public int capNhatTrangThai(String maPhong, int trangThai) {
        try {
            String sql = "UPDATE phongTro SET trangThai = ? WHERE maPhong = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setInt(1, trangThai);
            preparedStatement.setString(2, maPhong);

            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            return 1;
        }
    }

    public int themPhongTro(PhongEntity phong, PhongTroEntity phongTro) {
        try {
            String sql = "INSERT INTO phongtro(phongId, maPhong, tenPhong, "
                    + "giaThang, giaDien, giaNuoc, trangThai) VALUES(?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setLong(1, phongTro.getPhongId());
            preparedStatement.setString(2, phongTro.getMaPhong());
            preparedStatement.setString(3, phongTro.getTenPhong());
            preparedStatement.setDouble(4, phongTro.getGiaThang());
            preparedStatement.setDouble(5, phongTro.getGiaDien());
            preparedStatement.setDouble(6, phongTro.getGiaNuoc());
            preparedStatement.setLong(7, phongTro.getTrangThai());

            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            return 1;
        }
    }
}
