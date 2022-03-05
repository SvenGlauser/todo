package ch.sven.domain.task.repository;

import ch.sven.infrastructure.entity.TaskEntity;
import ch.sven.infrastructure.repository.jpa.TaskRepositoryEntity;
import ch.sven.infrastructure.repository.task.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TaskRepositoryImpl implements TaskRepository {

    @Autowired
    private TaskRepositoryEntity taskRepository;

    @Override
    public List<TaskEntity> findAll() {
        return StreamSupport.stream(taskRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public TaskEntity createTask(TaskEntity taskEntity) {
        return taskRepository.save(taskEntity);
    }
}
