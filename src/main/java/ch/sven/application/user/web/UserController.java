package ch.sven.application.user.web;

import ch.sven.application.configuration.ApiConfig;
import ch.sven.application.user.dto.UserDto;
import ch.sven.application.user.service.UserServiceApplicationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ApiConfig.API_URL)
public class UserController {

    @Autowired
    private UserServiceApplicationImpl userServiceApplication;

    @GetMapping("/users")
    public List<UserDto> listUser() {
        return userServiceApplication.findAll();
    }

    @PostMapping("/users")
    public UserDto createUser(@RequestBody UserDto userDto) {
        return userServiceApplication.createUser(userDto);
    }
}
