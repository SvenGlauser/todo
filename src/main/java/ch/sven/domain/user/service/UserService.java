package ch.sven.domain.user.service;

import ch.sven.domain.user.model.User;
import ch.sven.infrastructure.entity.UserEntity;
import ch.sven.infrastructure.repository.UserRepository;

import java.util.List;

public interface UserService {

    List<User> findAll();
}
