package ch.sven.application.utilisateur.service;

import ch.sven.application.utilisateur.dto.UtilisateurDto;
import ch.sven.application.utilisateur.dto.UtilisateurDtoLight;

import java.util.List;

public interface UtilisateurServiceApplication {

    /**
     * Récupérer la liste des utilisateurs
     * @return Liste des utilisateurs
     */
    List<UtilisateurDtoLight> recupererUtilisateurs();

    /**
     * Récupérer un utilisateur
     * @param username Nom de l'utilisateur à retrouver
     * @return Un utilisateur
     */
    UtilisateurDtoLight recupererUtilisateur(String username);

    /**
     * Sauvegarder un utilisateur
     * @param utilisateurDto Utilisateur à sauvegarder
     * @return Utilisateur qui a été sauvegarder
     */
    UtilisateurDto sauvegarderUtilisateur(UtilisateurDto utilisateurDto);
}
