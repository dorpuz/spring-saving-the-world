package pl.edu.wszib.savingtheworld.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrzepisDAO extends CrudRepository<Przepis, Long> {
    List<Przepis> findAll();
    Przepis findByTytul(String tytul);
}
