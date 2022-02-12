package ch.sven.infrastructure.repository.task;

import ch.sven.infrastructure.entity.TaskEntity;
import ch.sven.infrastructure.entity.UserEntity;

import java.util.List;

public interface TaskRepository {

    List<TaskEntity> findAll();

    TaskEntity createTask(TaskEntity taskEntity);
}
