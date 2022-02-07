package ch.sven.application.task.service;

import ch.sven.application.task.dto.TaskDto;

import java.util.List;

public interface TaskServiceApplication {

    List<TaskDto> findAll();
}
