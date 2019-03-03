package pl.edu.wszib.savingtheworld.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PodatnikDAO extends CrudRepository<Podatnik,Long> {

Optional<Podatnik> findByImieIgnoreCase(String imie);
List<Podatnik> findAllByNazwiskoIgnoreCaseOrderByImieDesc(String nazwisko);

List<Podatnik> findAllByFaktury_Tytul(String tytul);
List<Podatnik> findAll();

@Query(value = "select * from HumanResources.EmployeePayHistory; ", nativeQuery = true)
String moje();
}
