package ch.sven.domain.task.service;

import ch.sven.domain.task.model.Task;

import java.util.List;

public interface TaskService {

    List<Task> findAll();
}
