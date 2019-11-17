package hu.elte.kezilabda.Kezilabda.repository;

import hu.elte.kezilabda.Kezilabda.model.Jatekos;
import org.springframework.data.repository.CrudRepository;

public interface JatekosRepository extends CrudRepository<Jatekos, Integer> {
    //Iterable<Csapat> findAllByTitle(String nev);
}
