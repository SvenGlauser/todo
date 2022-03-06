package ch.sven.domain.user.repository;

import ch.sven.infrastructure.entity.UserEntity;
import ch.sven.infrastructure.repository.jpa.UserRepositoryEntity;
import ch.sven.infrastructure.repository.user.UserRepository;
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
    public List<UserEntity> findAll() {
        return StreamSupport.stream(userRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }
}
