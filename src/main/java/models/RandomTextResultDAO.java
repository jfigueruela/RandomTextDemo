package models;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface RandomTextResultDAO extends
        CrudRepository<RandomTextResult, Long> {

}
