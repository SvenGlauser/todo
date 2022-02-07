package ch.sven.domain.status.service;

import ch.sven.domain.status.model.Status;

import java.util.List;

public interface StatusService {

    List<Status> findAll();
}
