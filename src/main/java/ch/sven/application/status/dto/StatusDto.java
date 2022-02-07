package ch.sven.application.status.dto;

import ch.sven.application.common.Dto;
import ch.sven.domain.status.model.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatusDto extends Dto<Status> {
    private String statusName;
    private String statusDescription;

    public StatusDto() {
        // Reste vide
    }

    public StatusDto(Status status) {
        super(status);
        this.statusName = status.getStatusName();
        this.statusDescription = status.getStatusDescription();
    }

    @Override
    public Status toDomaineEntity() {
        Status status = new Status();
        status.setStatusName(this.statusName);
        status.setStatusDescription(this.statusDescription);
        return status;
    }
}
