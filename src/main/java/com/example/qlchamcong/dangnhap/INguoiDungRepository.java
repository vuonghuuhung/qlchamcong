package com.example.qlchamcong.dangnhap;

import com.example.qlchamcong.entity.NguoiDung;

import java.util.List;

public interface INguoiDungRepository {
    void themNguoiDung(NguoiDung item);
    void xoaNguoiDung(NguoiDung item);
    void suaNguoiDung(NguoiDung item);
    void capNhatNguoiDung(NguoiDung item);
    List<NguoiDung> layTatCaNguoiDung();
    NguoiDung timKiemTheoTen(String name);
    NguoiDung timKiemTheoTenDangNhap(String username);
}
