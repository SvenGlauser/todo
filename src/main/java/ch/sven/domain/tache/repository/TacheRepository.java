package ch.sven.domain.tache.repository;

import ch.sven.infrastructure.entity.TacheEntity;

import java.util.List;

public interface TacheRepository {

    /**
     * Récupérer toutes les tâches
     * @return Une liste de toutes les tâches
     */
    List<TacheEntity> recupererTaches();

    /**
     * Sauvegarder une tâche
     * @param tacheEntity La tâche à sauvegarder
     * @return La tâche qui a été sauvegardée
     */
    TacheEntity sauvegarderTache(TacheEntity tacheEntity);
}
