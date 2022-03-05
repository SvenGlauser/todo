package ch.sven.domain.status.repository;

import ch.sven.infrastructure.entity.StatusEntity;
import ch.sven.infrastructure.repository.jpa.StatusRepositoryEntity;
import ch.sven.infrastructure.repository.status.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class StatusRepositoryImpl implements StatusRepository {

    @Autowired
    private StatusRepositoryEntity statusRepository;

    @Override
    public List<StatusEntity> findAll() {
        return StreamSupport.stream(statusRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public StatusEntity createStatus(StatusEntity statusEntity) {
        return statusRepository.save(statusEntity);
    }
}
