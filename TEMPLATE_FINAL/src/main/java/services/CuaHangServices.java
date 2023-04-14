package services;

import entity.CuaHang;

import java.util.List;

public interface CuaHangServices {
    void insert(CuaHang ch);
    void update(CuaHang ch);
    void delete(CuaHang ch);
    List<CuaHang> finByAllCuaHang();
    CuaHang finById(String id);
    CuaHang finByMa(String ma);
}
