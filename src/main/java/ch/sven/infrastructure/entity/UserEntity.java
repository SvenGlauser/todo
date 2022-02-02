package ch.sven.infrastructure.entity;

import ch.sven.domain.user.model.User;
import ch.sven.infrastructure.common.Dao;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "TB_USER", schema = "TODO")
public class UserEntity extends Dao<User> {

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Override
    public User toDomaineEntity() {
        User user = new User();
        user.setUsername(this.username);
        user.setPassword(this.password);
        return user;
    }
}
