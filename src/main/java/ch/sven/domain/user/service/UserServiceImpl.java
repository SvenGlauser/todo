package ch.sven.domain.user.service;

import ch.sven.domain.user.model.User;
import ch.sven.infrastructure.entity.UserEntity;
import ch.sven.domain.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> recupererUsers() {
        return userRepository.recupererUsers().stream().map(UserEntity::toDomaine).collect(Collectors.toList());
    }

    @Override
    public User sauvegarderUser(User user) {
        return Optional.ofNullable(userRepository.sauvegarderUser(Optional.of(user).map(UserEntity::new).orElse(null))).map(UserEntity::toDomaine).orElse(null);
    }
}
