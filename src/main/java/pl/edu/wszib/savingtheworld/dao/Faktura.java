package pl.edu.wszib.savingtheworld.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Faktura {

    @Id
    @GeneratedValue
    Long faktura_id;

    double kwota;
    String tytul;

    public Faktura(){
    }

    public Faktura(double kwota, String tytul) {
        this.kwota = kwota;
        this.tytul = tytul;
    }

    public Long getFaktura_id() {
        return faktura_id;
    }

    public void setFaktura_id(Long faktura_id) {
        this.faktura_id = faktura_id;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }
}


