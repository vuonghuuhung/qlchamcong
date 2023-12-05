package com.example.qlchamcong.dangnhap;

import com.example.qlchamcong.database.DatabaseType;

import java.sql.Connection;

public class DangNhapInitializer {
    private static INguoiDungRepository nguoiDungRepository;
    private static IDangNhapService dangNhapService;
    private static IDangNhapController dangNhapController;

    public DangNhapInitializer(Connection connection, DatabaseType databaseType) {
        switch (databaseType) {
            case MYSQL:
                nguoiDungRepository = new MySQLNguoiDungRepository(connection);
        }
        dangNhapService = new DangNhapService(nguoiDungRepository);
        dangNhapController = new DangNhapController(dangNhapService);
    }

    public static INguoiDungRepository getNguoiDungRepository() {
        return nguoiDungRepository;
    }

    public static IDangNhapService getDangNhapService() {
        return dangNhapService;
    }

    public static IDangNhapController getDangNhapController() {
        return dangNhapController;
    }
}
