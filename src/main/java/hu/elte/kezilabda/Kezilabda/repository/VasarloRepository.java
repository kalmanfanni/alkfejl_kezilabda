package hu.elte.kezilabda.Kezilabda.repository;


import hu.elte.kezilabda.Kezilabda.model.Vasarlo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VasarloRepository extends CrudRepository<Vasarlo, Integer> {
}
