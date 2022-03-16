package ch.sven.domain.enregistrement.repository;

import ch.sven.infrastructure.entity.EnregistrementEntity;

import java.util.List;

public interface EnregistrementRepository {

    /**
     * Récupérer toutes les enregistrements
     * @return Une liste de tous les enregistrements
     */
    List<EnregistrementEntity> recupererEnregistrements();

    /**
     * Sauvegarder une enregistrement
     * @param enregistrementEntity La enregistrement à sauvegarder
     * @return La enregistrement qui a été sauvegardé
     */
    EnregistrementEntity sauvegarderEnregistrement(EnregistrementEntity enregistrementEntity);
}
