package ch.sven.application.task.service;

import ch.sven.application.task.dto.TaskDto;
import ch.sven.domain.task.service.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TaskServiceApplicationImpl implements TaskServiceApplication {

    @Autowired
    private TaskServiceImpl taskService;

    @Override
    public List<TaskDto> findAll() {
        return taskService.findAll().stream().map(TaskDto::new).collect(Collectors.toList());
    }

    @Override
    public TaskDto createTask(TaskDto taskDto) {
        return Optional.ofNullable(taskService.createTask(Optional.ofNullable(taskDto).map(TaskDto::toDomaine).orElse(null))).map(TaskDto::new).orElse(null);
    }
}
