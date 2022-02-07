package ch.sven.application.user.web;

import ch.sven.application.configuration.ApiConfig;
import ch.sven.application.user.dto.UserDto;
import ch.sven.application.user.service.UserServiceApplicationImpl;
import ch.sven.domain.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(name = ApiConfig.API_URL)
public class UserController {

    @Autowired
    private UserServiceApplicationImpl userServiceApplication;

    @GetMapping("/users")
    public List<UserDto> listUser() {
        return userServiceApplication.findAll();
    }
}
