package ch.sven.application.status.service;

import ch.sven.application.status.dto.StatusDto;

import java.util.List;

public interface StatusServiceApplication {

    /**
     * Récupérer tous les status
     * @return Une liste de tous les status
     */
    List<StatusDto> findAll();

    /**
     * Créer un status
     * @param statusDto Status à créer
     * @return Le status créé
     */
    StatusDto createStatus(StatusDto statusDto);
}
