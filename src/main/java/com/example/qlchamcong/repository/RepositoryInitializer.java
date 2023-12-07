package com.example.qlchamcong.repository;

import com.example.qlchamcong.database.DatabaseType;

import java.sql.Connection;

public class RepositoryInitializer {
    private static INguoiDungRepository nguoiDungRepository;

    public RepositoryInitializer(Connection connection, DatabaseType databaseType) {
        switch (databaseType) {
            case MYSQL:
                nguoiDungRepository = new MySQLNguoiDungRepository(connection);
        }
    }

    public static INguoiDungRepository getNguoiDungRepository() {
        return nguoiDungRepository;
    }
}
