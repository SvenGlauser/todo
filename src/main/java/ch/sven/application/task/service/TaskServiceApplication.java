package ch.sven.application.task.service;

import ch.sven.application.task.dto.TaskDto;

import java.util.List;

public interface TaskServiceApplication {

    /**
     * Récupérer toutes les tâches
     * @return Une liste de toutes les tâches
     */
    List<TaskDto> findAll();

    /**
     * Créer une tâche
     * @param taskDto La tâche à créer
     * @return La tâche créée
     */
    TaskDto createTask(TaskDto taskDto);
}
