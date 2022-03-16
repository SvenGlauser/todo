package ch.sven.infrastructure.repository.jpa;

import ch.sven.infrastructure.entity.EnregistrementEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnregistrementRepositoryEntity extends CrudRepository<EnregistrementEntity, Long> {
}
