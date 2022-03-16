package ch.sven.domain.enregistrement.service;

import ch.sven.domain.enregistrement.model.Enregistrement;

import java.util.List;

public interface EnregistrementService {

    /**
     * Récupérer toutes les enregistrements
     * @return Une liste de toutes les enregistrements
     */
    List<Enregistrement> recupererEnregistrements();

    /**
     * Sauvegarder une enregistrement
     * @param enregistrement La enregistrement à sauvegarder
     * @return La enregistrement qui a été sauvegardé
     */
    Enregistrement sauvegarderEnregistrement(Enregistrement enregistrement);
}
