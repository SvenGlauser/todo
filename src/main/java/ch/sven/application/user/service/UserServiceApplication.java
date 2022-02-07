package ch.sven.application.user.service;

import ch.sven.application.user.dto.UserDto;

import java.util.List;

public interface UserServiceApplication {

    List<UserDto> findAll();
}
