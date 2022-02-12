package ch.sven.infrastructure.entity;

import ch.sven.domain.task.model.Task;
import ch.sven.infrastructure.common.Dao;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Optional;

@Getter
@Setter
@Entity
@Table(name = "TB_TASK", schema = "TODO")
@NoArgsConstructor
public class TaskEntity extends Dao<Task> {

    @Column(name = "TASKNAME")
    private String taskName;

    @Column(name = "TASKDESCRIPTION")
    private String taskDescription;

    @ManyToOne(targetEntity = UserEntity.class)
    @JoinColumn(name = "FK_USER")
    private UserEntity user;

    @ManyToOne(targetEntity = StatusEntity.class)
    @JoinColumn(name = "FK_STATUS")
    private StatusEntity status;

    /**
     * Constructeur paramétré
     */
    public TaskEntity(Task task) {
        super(task);
        this.taskDescription = task.getTaskDescription();
        this.taskName = task.getTaskName();
        this.user = Optional.of(task.getUser()).map(UserEntity::new).orElse(null);
        this.status = Optional.of(task.getStatus()).map(StatusEntity::new).orElse(null);
    }

    @Override
    public Task toDomaineEntity() {
        Task task = new Task();
        task.setTaskDescription(this.taskDescription);
        task.setTaskName(this.taskName);
        task.setUser(this.user.toDomaine());
        task.setStatus(this.status.toDomaine());
        return task;
    }
}
