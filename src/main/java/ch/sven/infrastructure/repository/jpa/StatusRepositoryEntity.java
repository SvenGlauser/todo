package ch.sven.infrastructure.repository.jpa;

import ch.sven.infrastructure.entity.StatusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepositoryEntity extends CrudRepository<StatusEntity, Long> {
}
