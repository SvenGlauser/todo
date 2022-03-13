package ch.sven.domain.utilisateur.repository;

import ch.sven.infrastructure.entity.UtilisateurEntity;

import java.util.List;

public interface UtilisateurRepository {

    /**
     * Récupérer la liste des utilisateurs
     * @return Liste des utilisateurs
     */
    List<UtilisateurEntity> recupererUtilisateurs();

    /**
     * Sauvegarder un utilisateur
     * @param utilisateurEntity Utilisateur à sauvegarder
     * @return Utilisateur qui à été sauvegarder
     */
    UtilisateurEntity sauvegarderUtilisateur(UtilisateurEntity utilisateurEntity);
}
