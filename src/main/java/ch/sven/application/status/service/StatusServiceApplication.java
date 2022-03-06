package ch.sven.application.status.service;

import ch.sven.application.status.dto.StatusDto;

import java.util.List;

public interface StatusServiceApplication {

    /**
     * Récupérer tous les status
     * @return Une liste de tous les status
     */
    List<StatusDto> recupererStatus();

    /**
     * Sauvegarder un status
     * @param statusDto Le status à sauvegarder
     * @return Le status qui a été sauvegardé
     */
    StatusDto sauvegarderStatus(StatusDto statusDto);
}
