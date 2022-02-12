package ch.sven.infrastructure.repository.task;

import ch.sven.infrastructure.entity.TaskEntity;

import java.util.List;

public interface TaskRepository {

    List<TaskEntity> findAll();

    TaskEntity createTask(TaskEntity taskEntity);
}
