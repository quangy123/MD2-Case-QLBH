package model;

import java.util.ArrayList;
import java.util.List;

public class donHang {
    private int id;
    private String tenKhachHang;
    private String gmail;
    private String sdt;

    private List<donDatHang> donDatHangs = new ArrayList<donDatHang>();

    public donHang(int id, String tenKhachHang, String gmail, String sdt, List<donDatHang> donDatHangs) {
        this.id = id;
        this.tenKhachHang = tenKhachHang;
        this.gmail = gmail;
        this.sdt = sdt;
        this.donDatHangs = donDatHangs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public List<donDatHang> getDonDatHangs() {
        return donDatHangs;
    }

    public void setDonDatHangs(List<donDatHang> donDatHangs) {
        this.donDatHangs = donDatHangs;
    }


}
