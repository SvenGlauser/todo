package ch.sven.domain.user.service;

import ch.sven.domain.user.model.User;

import java.util.List;

public interface UserService {

    /**
     * Récupérer la liste des utilisateurs
     * @return Liste des utilisateurs
     */
    List<User> recupererUsers();

    /**
     * Sauvegarder un utilisateur
     * @param user Utilisateur à sauvegarder
     * @return Utilisateur qui à été sauvegarder
     */
    User sauvegarderUser(User user);
}
