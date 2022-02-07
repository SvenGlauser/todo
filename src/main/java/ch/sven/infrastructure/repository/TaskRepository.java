package ch.sven.infrastructure.repository;

import ch.sven.infrastructure.entity.TaskEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<TaskEntity, Long> {
}
