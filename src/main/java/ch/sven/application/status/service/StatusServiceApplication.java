package ch.sven.application.status.service;

import ch.sven.application.status.dto.StatusDto;

import java.util.List;

public interface StatusServiceApplication {

    List<StatusDto> findAll();
}
