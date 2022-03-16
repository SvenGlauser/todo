package ch.sven.domain.action.repository;

import ch.sven.infrastructure.entity.ActionEntity;

import java.util.List;

public interface ActionRepository {

    /**
     * Récupérer toutes les tâches
     * @return Une liste de toutes les tâches
     */
    List<ActionEntity> recupererActions();

    /**
     * Sauvegarder une tâche
     * @param actionEntity La tâche à sauvegarder
     * @return La tâche qui a été sauvegardée
     */
    ActionEntity sauvegarderAction(ActionEntity actionEntity);
}
