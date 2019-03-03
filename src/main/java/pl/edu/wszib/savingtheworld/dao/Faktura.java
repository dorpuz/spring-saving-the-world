package pl.edu.wszib.savingtheworld.dao;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table
public class Faktura {

    @Id
    @GeneratedValue
    Long faktura_id;

    double kwota;
    String tytul;

  /*  @OneToOne(fetch = FetchType.LAZY, optional = false)
    Podatnik podatnik;*/

  @ManyToOne(fetch = FetchType.EAGER, optional = false)
  @JoinColumn(name = "podatnik_id", nullable = false)
          @OnDelete(action = OnDeleteAction.CASCADE)
  Podatnik podatnik;

    public Podatnik getPodatnik() {
        return podatnik;
    }

    public void setPodatnik(Podatnik podatnik) {
        this.podatnik = podatnik;
    }

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


