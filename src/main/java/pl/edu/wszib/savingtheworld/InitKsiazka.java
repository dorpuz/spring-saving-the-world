package pl.edu.wszib.savingtheworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.edu.wszib.savingtheworld.dao.*;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Random;

@Component
public class InitKsiazka {

    @Autowired
    TypSkladnikaDAO typSkladnikaDAO;

    @Autowired
    SkładnikDAO składnikDAO;

    @Autowired
    PrzepisDAO przepisDAO;

    @Autowired
    KsiazkaKucharskaDAO ksiazkaKucharskaDAO;

    @PostConstruct
    public void init(){

      /*  typSkladnikaDAO.save(new TypSkladnika("jajka"));
        ksiazkaKucharskaDAO.save(new KsiazkaKucharska("moja"));
        przepisDAO.save(new Przepis("jajecznica",ksiazkaKucharskaDAO.findByTytul("moja")));
        składnikDAO.save(new Składnik(4, typSkladnikaDAO.findByNazwa("jajka"), przepisDAO.findByTytul("jajecznica")));

        System.out.println("");*/

        for (int i = 0; i <10; i++) {
            TypSkladnika typSkladnika = new TypSkladnika();
            typSkladnika.setNazwa("skladnik" + i);
            typSkladnikaDAO.save(typSkladnika);
        }

        KsiazkaKucharska ksiazkaKucharska = new KsiazkaKucharska();
        ksiazkaKucharska.setTytul("Cookbook");
        ksiazkaKucharskaDAO.save(ksiazkaKucharska);

        Przepis przepis = new Przepis();
        przepis.setTytul("Omlet");
        przepis.setKsiazkaKucharska(ksiazkaKucharska);
        przepisDAO.save(przepis);

        List<TypSkladnika> typSkladnikas = typSkladnikaDAO.findAll();
        for (TypSkladnika typ : typSkladnikas){
            Składnik składnik = new Składnik();
            składnik.setIlosc(new Random().nextInt(5)+1);
            składnik.setTypSkladnika(typ);
            składnik.setPrzepis(przepis);
            składnikDAO.save(składnik);
        }


        System.out.println("");


    }
}
