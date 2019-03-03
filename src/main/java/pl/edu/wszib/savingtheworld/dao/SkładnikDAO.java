package pl.edu.wszib.savingtheworld.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkładnikDAO extends CrudRepository<Składnik, Long> {
    List<Składnik> findAll();
    //Przepis findByPrzepis_Tytul(String tytul);
}
