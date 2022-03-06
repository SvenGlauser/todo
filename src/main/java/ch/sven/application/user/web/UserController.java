package ch.sven.application.user.web;

import ch.sven.application.configuration.ApiConfig;
import ch.sven.application.user.dto.UserDto;
import ch.sven.application.user.dto.UserDtoLight;
import ch.sven.application.user.service.UserServiceApplication;
import ch.sven.application.user.service.UserServiceApplicationImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ApiConfig.API_URL + "/users")
@AllArgsConstructor
public class UserController {

    private final UserServiceApplication userServiceApplication;

    @GetMapping
    public List<UserDtoLight> listUser() {
        return userServiceApplication.findAll();
    }

    @PostMapping
    public UserDto createUser(@RequestBody UserDto userDto) {
        return userServiceApplication.createUser(userDto);
    }
}
