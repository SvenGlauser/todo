package ch.sven.infrastructure.repository.jpa;

import ch.sven.infrastructure.entity.TaskEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepositoryEntity extends CrudRepository<TaskEntity, Long> {
}
