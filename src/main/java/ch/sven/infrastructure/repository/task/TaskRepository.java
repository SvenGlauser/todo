package ch.sven.infrastructure.repository.task;

import ch.sven.infrastructure.entity.TaskEntity;

import java.util.List;

public interface TaskRepository {

    /**
     * Récupérer toutes les tâches
     * @return Une liste de toutes les tâches
     */
    List<TaskEntity> recupererTasks();

    /**
     * Sauvegarder une tâche
     * @param taskEntity La tâche à sauvegarder
     * @return La tâche qui a été sauvegardée
     */
    TaskEntity sauvegarderTask(TaskEntity taskEntity);
}
