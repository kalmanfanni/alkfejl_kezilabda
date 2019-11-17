package hu.elte.kezilabda.Kezilabda.repository;

import hu.elte.kezilabda.Kezilabda.model.Meccs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeccsRepository extends CrudRepository<Meccs, Integer> {
    //Iterable<Csapat> findAllByTitle(String nev);
}
