package ch.sven.domain.status.service;

import ch.sven.domain.status.model.Status;
import ch.sven.infrastructure.entity.StatusEntity;
import ch.sven.infrastructure.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusRepository statusRepository;

    @Override
    public List<Status> findAll() {
        return StreamSupport.stream(statusRepository.findAll().spliterator(), false).map(StatusEntity::toDomaine).collect(Collectors.toList());
    }
}
