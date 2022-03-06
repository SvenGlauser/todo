package ch.sven.application.user.service;

import ch.sven.application.user.dto.UserDto;
import ch.sven.application.user.dto.UserDtoLight;

import java.util.List;

public interface UserServiceApplication {

    /**
     * Récupérer la liste des utilisateurs
     * @return Liste des utilisateurs
     */
    List<UserDtoLight> recupererUsers();

    /**
     * Sauvegarder un utilisateur
     * @param userDto Utilisateur à sauvegarder
     * @return Utilisateur qui à été sauvegarder
     */
    UserDto sauvegarderUser(UserDto userDto);
}
