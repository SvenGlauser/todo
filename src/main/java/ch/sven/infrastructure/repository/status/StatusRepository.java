package ch.sven.infrastructure.repository.status;

import ch.sven.infrastructure.entity.StatusEntity;

import java.util.List;

public interface StatusRepository {

    List<StatusEntity> findAll();
}
