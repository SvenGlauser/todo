package ch.sven.application.status.dto;

import ch.sven.application.common.Dto;
import ch.sven.domain.status.model.Status;
import ch.sven.domain.task.model.Task;
import ch.sven.domain.user.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatusDto extends Dto<Status> {
    private String statusName;
    private String statusDescription;

    @Override
    public Status toDomaineEntity() {
        Status status = new Status();
        status.setStatusName(this.statusName);
        status.setStatusDescription(this.statusDescription);
        return status;
    }
}
