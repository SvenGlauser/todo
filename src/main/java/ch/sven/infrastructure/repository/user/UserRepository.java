package ch.sven.infrastructure.repository.user;

import ch.sven.infrastructure.entity.UserEntity;

import java.util.List;

public interface UserRepository {

    /**
     * Récupérer la liste des utilisateurs
     * @return Liste des utilisateurs
     */
    List<UserEntity> recupererUsers();

    /**
     * Sauvegarder un utilisateur
     * @param userEntity Utilisateur à sauvegarder
     * @return Utilisateur qui à été sauvegarder
     */
    UserEntity sauvegarderUser(UserEntity userEntity);
}
