package ch.sven.domain.progression.repository;

import ch.sven.domain.progression.model.Progression;

import java.util.List;

public interface ProgressionRepository {

    /**
     * Récupérer toutes les progressions
     * @return Une liste de tous les progressions
     */
    List<Progression> recupererProgressions();

    /**
     * Sauvegarder une progression
     * @param progression La progression à sauvegarder
     * @return La progression qui a été sauvegardé
     */
    Progression sauvegarderProgression(Progression progression);
}
