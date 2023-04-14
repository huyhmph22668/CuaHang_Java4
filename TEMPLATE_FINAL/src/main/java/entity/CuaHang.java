package entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "CuaHang")
public class CuaHang {
    @jakarta.persistence.Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;
    @Column(name = "Ma")
    private String Ma;
    @Column(name = "Ten")
    private String Ten;
    @Column(name = "DiaChi")
    private String DiaChi;
    @Column(name = "ThanhPho")
    private String ThanhPho;

    public CuaHang() {
    }

    public CuaHang(String ma, String ten, String diaChi, String thanhPho) {
        Ma = ma;
        Ten = ten;
        DiaChi = diaChi;
        ThanhPho = thanhPho;
    }

    public CuaHang(UUID id, String ma, String ten, String diaChi, String thanhPho) {
        Id = id;
        Ma = ma;
        Ten = ten;
        DiaChi = diaChi;
        ThanhPho = thanhPho;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String ma) {
        Ma = ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getThanhPho() {
        return ThanhPho;
    }

    public void setThanhPho(String thanhPho) {
        ThanhPho = thanhPho;
    }

    @Override
    public String toString() {
        return "CuaHang{" +
                "Id='" + Id + '\'' +
                ", Ma='" + Ma + '\'' +
                ", Ten='" + Ten + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                ", ThanhPho='" + ThanhPho + '\'' +
                '}';
    }
}
