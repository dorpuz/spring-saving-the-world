package pl.edu.wszib.savingtheworld.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KsiazkaKucharskaDAO extends CrudRepository<KsiazkaKucharska, Long> {

    List<KsiazkaKucharska> findAll();
    KsiazkaKucharska findByTytul(String tytul);
}
