package ch.sven.infrastructure.repository.user;

import ch.sven.infrastructure.entity.UserEntity;

import java.util.List;

public interface UserRepository {

    List<UserEntity> findAll();

    UserEntity createUser(UserEntity userEntity);
}
