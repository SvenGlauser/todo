package ch.sven.infrastructure.repository;

import ch.sven.infrastructure.entity.StatusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends CrudRepository<StatusEntity, Long> {
}
