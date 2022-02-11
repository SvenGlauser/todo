package ch.sven.infrastructure.repository.jpa;

import ch.sven.infrastructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryEntity extends CrudRepository<UserEntity, Long> {
}
