package ch.sven.domain.status.repository;

import ch.sven.infrastructure.entity.StatusEntity;
import ch.sven.infrastructure.repository.jpa.StatusRepositoryEntity;
import ch.sven.infrastructure.repository.status.StatusRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class StatusRepositoryImpl implements StatusRepository {

    private final StatusRepositoryEntity statusRepository;

    @Override
    public List<StatusEntity> recupererStatus() {
        return StreamSupport.stream(statusRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public StatusEntity sauvegarderStatus(StatusEntity statusEntity) {
        return statusRepository.save(statusEntity);
    }
}
