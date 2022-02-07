package ch.sven.domain.task.service;

import ch.sven.domain.task.model.Task;
import ch.sven.infrastructure.entity.TaskEntity;
import ch.sven.infrastructure.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> findAll() {
        return StreamSupport.stream(taskRepository.findAll().spliterator(), false).map(TaskEntity::toDomaine).collect(Collectors.toList());
    }
}
