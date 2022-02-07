package ch.sven.domain.user.service;

import ch.sven.domain.user.model.User;
import ch.sven.infrastructure.entity.UserEntity;
import ch.sven.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return StreamSupport.stream(userRepository.findAll().spliterator(), false).map(UserEntity::toDomaine).collect(Collectors.toList());
    }
}
