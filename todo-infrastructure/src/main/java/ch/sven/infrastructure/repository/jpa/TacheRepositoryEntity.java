package ch.sven.infrastructure.repository.jpa;

import ch.sven.infrastructure.entity.TacheEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacheRepositoryEntity extends CrudRepository<TacheEntity, Long> {
}
