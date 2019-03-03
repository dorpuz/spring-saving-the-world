package pl.edu.wszib.savingtheworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.edu.wszib.savingtheworld.dao.Faktura;
import pl.edu.wszib.savingtheworld.dao.FakturaDAO;
import pl.edu.wszib.savingtheworld.dao.Podatnik;
import pl.edu.wszib.savingtheworld.dao.PodatnikDAO;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Component
public class InitComponent {

    @Autowired
    PodatnikDAO podatnikDAO;

    @Autowired
    FakturaDAO fakturaDAO;

    /*@PostConstruct
    public void init() {

        IntStream.range(0, 10).forEach(i -> {
            Podatnik podatnik = podatnikDAO.save(new Podatnik("Jan" + i, "Naj" + i));
            Podatnik podatnikSaved = podatnikDAO.save(podatnik);

            IntStream.range(0,10).forEach(j -> {
                Faktura faktura = new Faktura(3.50, "FA02032019" + j);
                faktura.setPodatnik(podatnikSaved);
                faktura = fakturaDAO.save(faktura);
            });
        });

        System.out.println("");
        *//*podatnikDAO.save(new Podatnik( "Jan40", "Naj"));
        podatnikDAO.save(new Podatnik( "Jan", "Naj"));*//*
    }*/

    @PreDestroy
    public void teardown() {
        //mozna cos pozamykac, wyslac, zapisac
    }


}
