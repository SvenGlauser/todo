package ch.sven.application.task.service;

import ch.sven.application.task.dto.TaskDto;

import java.util.List;

public interface TaskServiceApplication {

    /**
     * Récupérer toutes les tâches
     * @return Une liste de toutes les tâches
     */
    List<TaskDto> recupererTasks();

    /**
     * Sauvegarder une tâche
     * @param taskDto La tâche à sauvegarder
     * @return La tâche qui a été sauvegardée
     */
    TaskDto sauvegarderTask(TaskDto taskDto);
}
