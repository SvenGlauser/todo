package ch.sven.application.task.service;

import ch.sven.application.task.dto.TaskDto;
import ch.sven.domain.task.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TaskServiceApplicationImpl implements TaskServiceApplication {

    private final TaskService taskService;

    @Override
    public List<TaskDto> recupererTasks() {
        return taskService.recupererTasks().stream().map(TaskDto::new).collect(Collectors.toList());
    }

    @Override
    public TaskDto sauvegarderTask(TaskDto taskDto) {
        return Optional.ofNullable(taskService.sauvegarderTask(Optional.ofNullable(taskDto).map(TaskDto::toDomaine).orElse(null))).map(TaskDto::new).orElse(null);
    }
}
