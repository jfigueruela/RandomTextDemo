package demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("randomTextResultDAO")
public interface RandomTextResultDAO extends CrudRepository<RandomTextResult, Long> {

}
