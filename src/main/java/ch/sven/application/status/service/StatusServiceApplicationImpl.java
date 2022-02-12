package ch.sven.application.status.service;

import ch.sven.application.status.dto.StatusDto;
import ch.sven.domain.status.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StatusServiceApplicationImpl implements StatusServiceApplication {

    @Autowired
    private StatusService statusService;

    @Override
    public List<StatusDto> findAll() {
        return statusService.findAll().stream().map(StatusDto::new).collect(Collectors.toList());
    }

    @Override
    public StatusDto createStatus(StatusDto statusDto) {
        return Optional.ofNullable(statusService.createStatus(Optional.ofNullable(statusDto).map(StatusDto::toDomaine).orElse(null))).map(StatusDto::new).orElse(null);
    }
}
