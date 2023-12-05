package com.example.qlchamcong;

import com.example.qlchamcong.dangnhap.DangNhapInitializer;
import com.example.qlchamcong.database.DatabaseConnector;
import com.example.qlchamcong.database.DatabaseType;
import com.example.qlchamcong.database.MySQLConnector;
import com.example.qlchamcong.importdlcc.ImportDLCCInitializer;

import java.sql.Connection;

public class Initializer {
    private static DangNhapInitializer dangNhapInitializer;
    private static ImportDLCCInitializer importDLCCInitializer;
    private static DatabaseConnector databaseConnector;

    public Initializer(DatabaseType databaseType) {
        Connection connection = null;

        switch (databaseType) {
            case MYSQL:
                databaseConnector = new MySQLConnector();
                connection = databaseConnector.getConnection();
        }

        dangNhapInitializer = new DangNhapInitializer(connection, databaseType);
        importDLCCInitializer = new ImportDLCCInitializer(connection, databaseType);
    }

    public static DangNhapInitializer getDangNhapInitializer() {
        return dangNhapInitializer;
    }

    public static ImportDLCCInitializer getImportDLCCInitializer() {
        return importDLCCInitializer;
    }
}
