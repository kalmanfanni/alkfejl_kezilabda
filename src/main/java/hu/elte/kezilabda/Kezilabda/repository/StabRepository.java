package hu.elte.kezilabda.Kezilabda.repository;

import hu.elte.kezilabda.Kezilabda.model.Stab;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StabRepository extends CrudRepository<Stab, Integer> {
        //Iterable<Csapat> findAllByTitle(String nev);
}
