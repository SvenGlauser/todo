package ch.sven.application.task.web;

import ch.sven.application.configuration.ApiConfig;
import ch.sven.domain.task.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
@RequestMapping(name = ApiConfig.API_URL)
public class TaskController {

    @GetMapping("/tasks")
    public Set<Task> listTask() {
        return null;
    }
}
