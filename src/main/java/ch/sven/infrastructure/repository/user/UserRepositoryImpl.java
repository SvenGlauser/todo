package ch.sven.infrastructure.repository.user;

import ch.sven.domain.user.repository.UserRepository;
import ch.sven.infrastructure.entity.UserEntity;
import ch.sven.infrastructure.repository.jpa.UserRepositoryEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserRepositoryEntity userRepository;

    @Override
    public List<UserEntity> recupererUsers() {
        return StreamSupport.stream(userRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public UserEntity sauvegarderUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }
}