package com.example.qlchamcong.service;

import com.example.qlchamcong.repository.RepositoryInitializer;

public class ServiceInitializer {
    private static IDangNhapService dangNhapService;
    private static IImportDLCCService importDLCCService;
    private static IQLNSHomeService qlnsHomeService;

    public ServiceInitializer() {
        this.dangNhapService = new DangNhapService(RepositoryInitializer.getNguoiDungRepository());
        this.importDLCCService = new ImportDLCCService();
        this.qlnsHomeService = new QLNSHomeService();
    }

    public static IDangNhapService getDangNhapService() {
        return dangNhapService;
    }

    public static IImportDLCCService getImportDLCCService() {
        return importDLCCService;
    }

    public static IQLNSHomeService getQlnsHomeService() {
        return qlnsHomeService;
    }
}
