package ch.sven.application.user.web;

import ch.sven.application.configuration.ApiConfig;
import ch.sven.application.user.dto.UserDto;
import ch.sven.application.user.dto.UserDtoLight;
import ch.sven.application.user.service.UserServiceApplication;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ApiConfig.API_URL + "/users")
@AllArgsConstructor
public class UserController {

    private final UserServiceApplication userServiceApplication;

    /**
     * Récupérer la liste des users
     * @return Une liste de UserDto
     */
    @GetMapping
    public List<UserDtoLight> listUser() {
        return userServiceApplication.findAll();
    }

    /**
     * Créer un utilisateur
     * @param userDto L'utilisateur à créer
     * @return L'utilisateur créé
     */
    @PostMapping
    public UserDto createUser(@RequestBody UserDto userDto) {
        return userServiceApplication.createUser(userDto);
    }
}
