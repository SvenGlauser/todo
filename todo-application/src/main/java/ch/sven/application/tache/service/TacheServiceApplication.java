package ch.sven.application.tache.service;

import ch.sven.application.tache.dto.TacheDto;

import java.util.List;

public interface TacheServiceApplication {

    /**
     * Récupérer toutes les tâches
     * @return Une liste de toutes les tâches
     */
    List<TacheDto> recupererTaches();

    /**
     * Sauvegarder une tâche
     * @param tacheDto La tâche à sauvegarder
     * @return La tâche qui a été sauvegardée
     */
    TacheDto sauvegarderTache(TacheDto tacheDto);
}
