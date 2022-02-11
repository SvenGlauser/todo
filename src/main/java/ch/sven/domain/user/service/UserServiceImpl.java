package ch.sven.domain.user.service;

import ch.sven.domain.user.model.User;
import ch.sven.infrastructure.entity.UserEntity;
import ch.sven.infrastructure.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll().stream().map(UserEntity::toDomaine).collect(Collectors.toList());
    }

    @Override
    public User createUser(User user) {
        return Optional.ofNullable(userRepository.createUser(Optional.of(user).map(UserEntity::new).orElse(null))).map(UserEntity::toDomaine).orElse(null);
    }
}
