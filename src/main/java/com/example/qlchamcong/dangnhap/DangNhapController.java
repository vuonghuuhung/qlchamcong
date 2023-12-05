package com.example.qlchamcong.dangnhap;

import com.example.qlchamcong.entity.VaiTro;

public class DangNhapController implements IDangNhapController {
    private static IDangNhapService dangNhapService;

    public DangNhapController(IDangNhapService dangNhapService) {
        this.dangNhapService = dangNhapService;
    }

    @Override
    public VaiTro dangNhap(String username, String password) {
        return null;
    }
}
