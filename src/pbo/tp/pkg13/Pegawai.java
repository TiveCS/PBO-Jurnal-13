package pbo.tp.pkg13;

import java.util.Date;

public class Pegawai {

    private int id;
    private String name;
    private String posisi;
    private Date tglLahir;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosisi() {
        return posisi;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    @Override
    public String toString() {
        return name;
    }
}
