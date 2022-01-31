package ch.sven.application.task.dto;

import ch.sven.application.common.Dto;
import ch.sven.domain.task.model.Task;
import ch.sven.domain.user.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDto extends Dto<Task> {
    private String taskName;
    private String taskDescription;
    private User user;

    @Override
    public Task toDomaineEntity() {
        Task task = new Task();
        task.setTaskName(this.taskName);
        task.setTaskDescription(this.taskDescription);
        task.setUser(this.user);
        return task;
    }
}
