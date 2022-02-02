package ch.sven.infrastructure.entity;

import ch.sven.domain.status.model.Status;
import ch.sven.infrastructure.common.Dao;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "TB_STATUS", schema = "TODO")
public class StatusEntity extends Dao<Status> {

    @Column(name = "STATUSNAME")
    private String statusName;

    @Column(name = "STATUSDESCRIPTION")
    private String statusDescription;

    @OneToMany(mappedBy = "status")
    private Set<TaskEntity> taskEntitySet;

    public StatusEntity() {
        // Reste vide
    }

    public StatusEntity(Status status) {
        super(status);
        this.statusDescription = status.getStatusDescription();
        this.statusName = status.getStatusName();
    }

    @Override
    public Status toDomaineEntity() {
        Status status = new Status();
        status.setStatusName(this.statusName);
        status.setStatusDescription(this.statusDescription);
        return status;
    }
}
