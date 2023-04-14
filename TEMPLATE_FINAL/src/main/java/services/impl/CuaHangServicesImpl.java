package services.impl;

import entity.CuaHang;
import repository.CuaHangRepository;
import services.CuaHangServices;

import java.util.List;

public class CuaHangServicesImpl implements CuaHangServices {
    private CuaHangRepository chRepo = new CuaHangRepository();
    @Override
    public void insert(CuaHang ch) {
        this.chRepo.insert(ch);
    }

    @Override
    public void update(CuaHang ch) {
        this.chRepo.update(ch);
    }

    @Override
    public void delete(CuaHang ch) {
        this.chRepo.delete(ch);
    }

    @Override
    public List<CuaHang> finByAllCuaHang() {
        return chRepo.finAllCuaHang();
    }

    @Override
    public CuaHang finById(String id) {
        return chRepo.finById(id);
    }

    @Override
    public CuaHang finByMa(String ma) {
        return chRepo.finByMa(ma);
    }
}
