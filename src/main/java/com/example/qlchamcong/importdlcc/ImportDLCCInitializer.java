package com.example.qlchamcong.importdlcc;

import com.example.qlchamcong.database.DatabaseType;

import java.sql.Connection;

public class ImportDLCCInitializer {
    private static IImportDLCCController controller;

    public ImportDLCCInitializer(Connection connection, DatabaseType databaseType) {
        this.controller = new ImportDLCCController();
    }

    public static IImportDLCCController getController() {
        return controller;
    }
}
