package ch.sven.application.progression.service;

import ch.sven.application.progression.dto.ProgressionDto;

import java.util.List;

public interface ProgressionServiceApplication {

    /**
     * Récupérer toutes les progressions
     * @return Une liste de toutes les progressions
     */
    List<ProgressionDto> recupererProgressions();

    /**
     * Sauvegarder un progression
     * @param progressionDto La progression à sauvegarder
     * @return La progression qui a été sauvegardé
     */
    ProgressionDto sauvegarderProgression(ProgressionDto progressionDto);
}
