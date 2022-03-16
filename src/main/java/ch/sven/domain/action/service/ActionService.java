package ch.sven.domain.action.service;

import ch.sven.domain.action.model.Action;

import java.util.List;

public interface ActionService {

    /**
     * Récupérer toutes les tâches
     * @return Une liste de toutes les tâches
     */
    List<Action> recupererActions();

    /**
     * Sauvegarder une tâche
     * @param action La tâche à sauvegarder
     * @return La tâche qui a été sauvegardée
     */
    Action sauvegarderAction(Action action);
}
