package model;

public class sanPham {
    private int id;
    private int soLuong;
    private String tenSp;
    private Float gia;

    public sanPham() {
    }

    public sanPham(int id, int soLuong, String tenSp, Float gia) {
        this.id = id;
        this.soLuong = soLuong;
        this.tenSp = tenSp;
        this.gia = gia;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }
}
