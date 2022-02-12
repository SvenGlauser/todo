package ch.sven.infrastructure.repository.status;

import ch.sven.infrastructure.entity.StatusEntity;
import ch.sven.infrastructure.entity.UserEntity;

import java.util.List;

public interface StatusRepository {

    List<StatusEntity> findAll();

    StatusEntity createStatus(StatusEntity statusEntity);
}
