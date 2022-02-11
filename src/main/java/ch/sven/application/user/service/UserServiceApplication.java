package ch.sven.application.user.service;

import ch.sven.application.user.dto.UserDto;

import java.util.List;

public interface UserServiceApplication {

    /**
     * Find all users
     * @return List of users
     */
    List<UserDto> findAll();

    /**
     * Create a new user
     * @param userDto The new user to create
     * @return The created user
     */
    UserDto createUser(UserDto userDto);
}
