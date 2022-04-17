package ch.sven.domain.progression.service;

import ch.sven.domain.progression.model.Progression;

import java.util.List;

public interface ProgressionService {

    /**
     * Récupérer toutes les progressions
     * @return Une liste de toutes les progressions
     */
    List<Progression> recupererProgressions();

    /**
     * Sauvegarder une progression
     * @param progression La progression à sauvegarder
     * @return La progression qui a été sauvegardé
     */
    Progression sauvegarderProgression(Progression progression);
}
