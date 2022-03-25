package ch.sven.infrastructure.repository.jpa;

import ch.sven.infrastructure.entity.ProgressionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgressionRepositoryEntity extends CrudRepository<ProgressionEntity, Long> {
}
