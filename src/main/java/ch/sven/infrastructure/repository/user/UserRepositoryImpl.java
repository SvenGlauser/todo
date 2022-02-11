package ch.sven.infrastructure.repository.user;

import ch.sven.infrastructure.entity.UserEntity;
import ch.sven.infrastructure.repository.jpa.UserRepositoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private UserRepositoryEntity userRepository;

    @Override
    public List<UserEntity> findAll() {
        return StreamSupport.stream(userRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }
}