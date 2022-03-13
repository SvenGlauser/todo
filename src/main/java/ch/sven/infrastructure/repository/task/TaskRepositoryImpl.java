package ch.sven.infrastructure.repository.task;

import ch.sven.domain.task.repository.TaskRepository;
import ch.sven.infrastructure.entity.TaskEntity;
import ch.sven.infrastructure.repository.jpa.TaskRepositoryEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class TaskRepositoryImpl implements TaskRepository {

    private final TaskRepositoryEntity taskRepository;

    @Override
    public List<TaskEntity> recupererTasks() {
        return StreamSupport.stream(taskRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public TaskEntity sauvegarderTask(TaskEntity taskEntity) {
        return taskRepository.save(taskEntity);
    }
}
