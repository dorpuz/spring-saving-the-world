package pl.edu.wszib.savingtheworld.dao;

import javax.persistence.*;

@Entity
@Table
public class Składnik {

    @Id
    @GeneratedValue
    Long id;

    @OneToOne(optional = false)
    TypSkladnika typSkladnika;

    @Column(nullable = false)
    int ilosc;

    @ManyToOne
    @JoinColumn(name = "przepis_id")
    Przepis przepis;

    public Składnik(){

    }

  /*  public Składnik(int ilosc, TypSkladnika typSkladnika) {
        this.ilosc = ilosc;
        this.typSkladnika = typSkladnika;
    }*/

    public Składnik( int ilosc,TypSkladnika typSkladnika, Przepis przepis) {
        this.typSkladnika = typSkladnika;
        this.ilosc = ilosc;
        this.przepis = przepis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypSkladnika getTypSkladnika() {
        return typSkladnika;
    }

    public void setTypSkladnika(TypSkladnika typSkladnika) {
        this.typSkladnika = typSkladnika;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public Przepis getPrzepis() {
        return przepis;
    }

    public void setPrzepis(Przepis przepis) {
        this.przepis = przepis;
    }
}
