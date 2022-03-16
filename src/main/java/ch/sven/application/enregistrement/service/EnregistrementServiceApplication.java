package ch.sven.application.enregistrement.service;

import ch.sven.application.enregistrement.dto.EnregistrementDto;

import java.util.List;

public interface EnregistrementServiceApplication {

    /**
     * Récupérer toutes les enregistrements
     * @return Une liste de toutes les enregistrements
     */
    List<EnregistrementDto> recupererEnregistrements();

    /**
     * Sauvegarder un enregistrement
     * @param enregistrementDto La enregistrement à sauvegarder
     * @return La enregistrement qui a été sauvegardé
     */
    EnregistrementDto sauvegarderEnregistrement(EnregistrementDto enregistrementDto);
}
