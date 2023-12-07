package com.example.qlchamcong.repository;

import com.example.qlchamcong.entity.NguoiDung;

import java.sql.Connection;
import java.util.List;

public class MySQLNguoiDungRepository implements INguoiDungRepository {
    private static Connection connection;

    public MySQLNguoiDungRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void themNguoiDung(NguoiDung item) {

    }

    @Override
    public void xoaNguoiDung(NguoiDung item) {

    }

    @Override
    public void suaNguoiDung(NguoiDung item) {

    }

    @Override
    public void capNhatNguoiDung(NguoiDung item) {

    }

    @Override
    public List<NguoiDung> layTatCaNguoiDung() {
        return null;
    }

    @Override
    public NguoiDung timKiemTheoTen(String name) {
        return null;
    }

    @Override
    public NguoiDung timKiemTheoTenDangNhap(String username) {
        return null;
    }
}
