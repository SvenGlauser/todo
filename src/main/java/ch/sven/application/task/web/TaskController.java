package ch.sven.application.task.web;

import ch.sven.application.configuration.ApiConfig;
import ch.sven.application.task.dto.TaskDto;
import ch.sven.application.task.service.TaskServiceApplication;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ApiConfig.API_URL + "/tasks")
@AllArgsConstructor
public class TaskController {

    private final TaskServiceApplication taskServiceApplication;

    @GetMapping
    public List<TaskDto> listTask() {
        return taskServiceApplication.findAll();
    }

    @PostMapping
    public TaskDto createTask(@RequestBody TaskDto taskDto) {
        return taskServiceApplication.createTask(taskDto);
    }
}
