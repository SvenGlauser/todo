package ch.sven.domain.tache.repository;

import ch.sven.domain.tache.model.Tache;

import java.util.List;

public interface TacheRepository {

    /**
     * Récupérer toutes les tâches
     * @return Une liste de toutes les tâches
     */
    List<Tache> recupererTaches();

    /**
     * Sauvegarder une tâche
     * @param tache La tâche à sauvegarder
     * @return La tâche qui a été sauvegardée
     */
    Tache sauvegarderTache(Tache tache);
}
