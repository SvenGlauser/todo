package ch.sven.domain.status.service;

import ch.sven.domain.status.model.Status;

import java.util.List;

public interface StatusService {

    /**
     * Récupérer tous les status
     * @return Une liste de tous les status
     */
    List<Status> recupererStatus();

    /**
     * Sauvegarder un status
     * @param status Le status à sauvegarder
     * @return Le status qui a été sauvegardé
     */
    Status sauvegarderStatus(Status status);
}
