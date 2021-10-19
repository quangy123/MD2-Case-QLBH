package model;

import java.util.ArrayList;
import java.util.List;

public class donDatHang {
    private int id;
    private int idDonDatHang;
    private int spId;
    private Float giá;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDonDatHang() {
        return idDonDatHang;
    }

    public void setIdDonDatHang(int idDonDatHang) {
        this.idDonDatHang = idDonDatHang;
    }

    public int getSpId() {
        return spId;
    }

    public void setSpId(int spId) {
        this.spId = spId;
    }

    public Float getGiá() {
        return giá;
    }

    public void setGiá(Float giá) {
        this.giá = giá;
    }
}
