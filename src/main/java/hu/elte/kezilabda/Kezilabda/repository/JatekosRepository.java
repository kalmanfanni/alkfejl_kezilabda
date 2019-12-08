package hu.elte.kezilabda.Kezilabda.repository;

import hu.elte.kezilabda.Kezilabda.model.Jatekos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JatekosRepository extends CrudRepository<Jatekos, Integer> {

}
