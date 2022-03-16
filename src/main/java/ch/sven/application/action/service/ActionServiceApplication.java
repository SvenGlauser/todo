package ch.sven.application.action.service;

import ch.sven.application.action.dto.ActionDto;

import java.util.List;

public interface ActionServiceApplication {

    /**
     * Récupérer toutes les tâches
     * @return Une liste de toutes les tâches
     */
    List<ActionDto> recupererActions();

    /**
     * Sauvegarder une tâche
     * @param actionDto La tâche à sauvegarder
     * @return La tâche qui a été sauvegardée
     */
    ActionDto sauvegarderAction(ActionDto actionDto);
}
