package ch.sven.application.user.service;

import ch.sven.application.user.dto.UserDto;
import ch.sven.domain.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceApplicationImpl implements UserServiceApplication {

    @Autowired
    private UserServiceImpl userService;

    @Override
    public List<UserDto> findAll() {
        return userService.findAll().stream().map(UserDto::new).collect(Collectors.toList());
    }
}
