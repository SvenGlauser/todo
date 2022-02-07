package ch.sven.application.task.web;

import ch.sven.application.configuration.ApiConfig;
import ch.sven.application.task.dto.TaskDto;
import ch.sven.application.task.service.TaskServiceApplicationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = ApiConfig.API_URL)
public class TaskController {

    @Autowired
    private TaskServiceApplicationImpl taskServiceApplication;

    @GetMapping("/tasks")
    public List<TaskDto> listTask() {
        return taskServiceApplication.findAll();
    }
}
