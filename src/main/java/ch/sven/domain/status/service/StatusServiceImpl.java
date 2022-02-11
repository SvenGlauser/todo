package ch.sven.domain.status.service;

import ch.sven.domain.status.model.Status;
import ch.sven.infrastructure.entity.StatusEntity;
import ch.sven.infrastructure.repository.status.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusRepository statusRepository;

    @Override
    public List<Status> findAll() {
        return statusRepository.findAll().stream().map(StatusEntity::toDomaine).collect(Collectors.toList());
    }
}
