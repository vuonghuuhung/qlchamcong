package com.example.qlchamcong.dangnhap;

import com.example.qlchamcong.entity.VaiTro;

public interface IDangNhapService {
    VaiTro dangNhap(String username, String password);
}
