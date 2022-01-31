package ch.sven.application.user.web;

import ch.sven.application.configuration.ApiConfig;
import ch.sven.domain.user.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
@RequestMapping(name = ApiConfig.API_URL)
public class UserController {

    @GetMapping("/users")
    public Set<User> listUser() {
        return null;
    }
}
