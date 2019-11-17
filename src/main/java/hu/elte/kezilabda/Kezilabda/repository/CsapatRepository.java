package hu.elte.kezilabda.Kezilabda.repository;

import hu.elte.kezilabda.Kezilabda.model.Csapat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CsapatRepository extends CrudRepository<Csapat, Integer> {
    //Iterable<Csapat> findAllByTitle(String nev);
}

