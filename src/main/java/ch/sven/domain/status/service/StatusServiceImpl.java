package ch.sven.domain.status.service;

import ch.sven.domain.status.model.Status;
import ch.sven.infrastructure.entity.StatusEntity;
import ch.sven.infrastructure.repository.status.StatusRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StatusServiceImpl implements StatusService {

    private final StatusRepository statusRepository;

    @Override
    public List<Status> recupererStatus() {
        return statusRepository.recupererStatus().stream().map(StatusEntity::toDomaine).collect(Collectors.toList());
    }

    @Override
    public Status sauvegarderStatus(Status status) {
        return Optional.ofNullable(statusRepository.sauvegarderStatus(Optional.ofNullable(status).map(StatusEntity::new).orElse(null))).map(StatusEntity::toDomaine).orElse(null);
    }
}
