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

    /**
     * Récupérer la liste des tâches
     * @return Une liste de tâche
     */
    @GetMapping
    public List<TaskDto> recupererTasks() {
        return taskServiceApplication.recupererTasks();
    }

    /**
     * Créer une tâche
     * @param taskDto Tâche à créé
     * @return La tâche créé
     */
    @PostMapping
    public TaskDto creerTask(@RequestBody TaskDto taskDto) {
        return taskServiceApplication.sauvegarderTask(taskDto);
    }

    /**
     * Modifier une tâche
     * @param taskDto Tâche à modifier
     * @return La tâche modifier
     */
    @PutMapping
    public TaskDto modifierTask(@RequestBody TaskDto taskDto) {
        return taskServiceApplication.sauvegarderTask(taskDto);
    }
}
