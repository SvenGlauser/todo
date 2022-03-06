package ch.sven.infrastructure.repository.status;

import ch.sven.infrastructure.entity.StatusEntity;

import java.util.List;

public interface StatusRepository {

    /**
     * Récupérer tous les status
     * @return Une liste de tous les status
     */
    List<StatusEntity> recupererStatus();

    /**
     * Sauvegarder un status
     * @param statusEntity Le status à sauvegarder
     * @return Le status qui a été sauvegardé
     */
    StatusEntity sauvegarderStatus(StatusEntity statusEntity);
}
