package ch.sven.domain.user.service;

import ch.sven.domain.user.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
}
