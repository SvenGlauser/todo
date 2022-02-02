package ch.sven.domain.task.model;

import ch.sven.domain.common.Model;
import ch.sven.domain.status.model.Status;
import ch.sven.domain.user.model.User;
import lombok.Data;

@Data
public class Task extends Model {

    private String taskName;
    private String taskDescription;
    private User user;
    private Status status;
}
