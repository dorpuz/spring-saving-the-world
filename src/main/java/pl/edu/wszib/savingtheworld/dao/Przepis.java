package pl.edu.wszib.savingtheworld.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Przepis {

    @Id
    @GeneratedValue
    Long id;
    @Column(nullable = false)
    String tytul;

    @OneToMany(mappedBy = "przepis", fetch = FetchType.EAGER)
    List<Składnik> składniki;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ksiazka_id")
    KsiazkaKucharska ksiazkaKucharska;

    public Przepis() {

    }

    public Przepis(String tytul, KsiazkaKucharska ksiazkaKucharska) {
        this.tytul = tytul;
        this.ksiazkaKucharska = ksiazkaKucharska;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public List<Składnik> getSkładniki() {
        return składniki;
    }

    public void setSkładniki(List<Składnik> składniki) {
        this.składniki = składniki;
    }

    public KsiazkaKucharska getKsiazkaKucharska() {
        return ksiazkaKucharska;
    }

    public void setKsiazkaKucharska(KsiazkaKucharska ksiazkaKucharska) {
        this.ksiazkaKucharska = ksiazkaKucharska;
    }
}
