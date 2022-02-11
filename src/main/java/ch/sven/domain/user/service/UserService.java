package ch.sven.domain.user.service;

import ch.sven.domain.user.model.User;

import java.util.List;

public interface UserService {

    /**
     * Find all users
     * @return List of users
     */
    List<User> findAll();

    /**
     * Create a new user
     * @param user The new user to create
     * @return The created user
     */
    User createUser(User user);
}
