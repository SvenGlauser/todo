package ch.sven.domain.task.service;

import ch.sven.domain.task.model.Task;

import java.util.List;

public interface TaskService {

    /**
     * Récupérer toutes les tâches
     * @return Une liste de toutes les tâches
     */
    List<Task> recupererTasks();

    /**
     * Sauvegarder une tâche
     * @param task La tâche à sauvegarder
     * @return La tâche qui a été sauvegardée
     */
    Task sauvegarderTask(Task task);
}
