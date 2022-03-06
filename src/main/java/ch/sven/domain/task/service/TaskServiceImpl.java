package ch.sven.domain.task.service;

import ch.sven.domain.task.model.Task;
import ch.sven.infrastructure.entity.TaskEntity;
import ch.sven.infrastructure.repository.task.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll().stream().map(TaskEntity::toDomaine).collect(Collectors.toList());
    }

    @Override
    public Task createTask(Task task) {
        return Optional.ofNullable(taskRepository.createTask(Optional.ofNullable(task).map(TaskEntity::new).orElse(null))).map(TaskEntity::toDomaine).orElse(null);
    }
}
