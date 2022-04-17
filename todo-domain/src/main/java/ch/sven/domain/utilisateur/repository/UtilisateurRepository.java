package ch.sven.domain.utilisateur.repository;

import ch.sven.domain.utilisateur.model.Utilisateur;

import java.util.List;

public interface UtilisateurRepository {

    /**
     * Récupérer la liste des utilisateurs
     * @return Liste des utilisateurs
     */
    List<Utilisateur> recupererUtilisateurs();

    /**
     * Sauvegarder un utilisateur
     * @param utilisateur Utilisateur à sauvegarder
     * @return Utilisateur qui à été sauvegarder
     */
    Utilisateur sauvegarderUtilisateur(Utilisateur utilisateur);
}
