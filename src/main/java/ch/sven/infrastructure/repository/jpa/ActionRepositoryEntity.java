package ch.sven.infrastructure.repository.jpa;

import ch.sven.infrastructure.entity.ActionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepositoryEntity extends CrudRepository<ActionEntity, Long> {
}
