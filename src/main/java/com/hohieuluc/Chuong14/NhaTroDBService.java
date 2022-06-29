package com.hohieuluc.Chuong14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.hohieuluc.Chuong14.Entity.PhongEntity;

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

            PhongEntity phongEntity = new PhongEntity(
                    resultSet.getLong("id"),
                    resultSet.getString("maPhong"),
                    resultSet.getString("tenPhong"),
                    resultSet.getString("loaiPhong"),
                    resultSet.getDouble("dienTich"),
                    resultSet.getLong("trangThai"));

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
                        resultSet.getString("maPhong"),
                        resultSet.getString("tenPhong"),
                        resultSet.getString("loaiPhong"),
                        resultSet.getDouble("dienTich"),
                        resultSet.getLong("trangThai"));
                phongEntities.add(phongEntity);
            }

            return phongEntities;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<PhongEntity> getPhong(int trangThai) {
        try {
            String sql = "SELECT * FROM phong WHERE trangThai = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, trangThai);

            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<PhongEntity> phongs = new ArrayList<>();

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

            return phongs;
        } catch (SQLException e) {
            return null;
        }
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
}
