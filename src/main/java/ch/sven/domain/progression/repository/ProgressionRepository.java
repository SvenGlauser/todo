package ch.sven.domain.progression.repository;

import ch.sven.infrastructure.entity.ProgressionEntity;

import java.util.List;

public interface ProgressionRepository {

    /**
     * Récupérer toutes les progressions
     * @return Une liste de tous les progressions
     */
    List<ProgressionEntity> recupererProgressions();

    /**
     * Sauvegarder une progression
     * @param progressionEntity La progression à sauvegarder
     * @return La progression qui a été sauvegardé
     */
    ProgressionEntity sauvegarderProgression(ProgressionEntity progressionEntity);
}
