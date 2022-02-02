package ch.sven.infrastructure.entity;

import ch.sven.domain.user.model.User;
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
@Table(name = "TB_USER", schema = "TODO")
public class UserEntity extends Dao<User> {

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @OneToMany(mappedBy = "user")
    private Set<TaskEntity> taskEntitySet;

    /**
     * Constructeur non paramétré
     */
    public UserEntity() {
        // Reste vide
    }

    /**
     * Constructeur paramétré
     */
    public UserEntity(User user) {
        super(user);
        this.username = user.getUsername();
        this.password = user.getPassword();
    }

    @Override
    public User toDomaineEntity() {
        User user = new User();
        user.setUsername(this.username);
        user.setPassword(this.password);
        return user;
    }
}
