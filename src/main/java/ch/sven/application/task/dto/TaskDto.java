package ch.sven.application.task.dto;

import ch.sven.application.common.Dto;
import ch.sven.application.status.dto.StatusDto;
import ch.sven.application.user.dto.UserDto;
import ch.sven.domain.task.model.Task;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@NoArgsConstructor
public class TaskDto extends Dto<Task> {
    private String taskName;
    private String taskDescription;
    private UserDto user;
    private StatusDto status;

    public TaskDto(Task task) {
        super(task);
        this.taskName = task.getTaskName();
        this.taskDescription = task.getTaskDescription();
        this.user = Optional.of(task.getUser()).map(UserDto::new).orElse(null);
        this.status = Optional.of(task.getStatus()).map(StatusDto::new).orElse(null);
    }

    @Override
    public Task toDomaineEntity() {
        Task task = new Task();
        task.setTaskName(this.taskName);
        task.setTaskDescription(this.taskDescription);
        task.setUser(this.user.toDomaine());
        task.setStatus(this.status.toDomaine());
        return task;
    }
}
