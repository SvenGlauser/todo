package ch.sven.application.user.dto;

import ch.sven.application.common.Dto;
import ch.sven.domain.user.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto extends Dto<User> {
    private String username;

    @Override
    public User toDomaineEntity() {
        User user = new User();
        user.setUsername(this.username);
        return user;
    }
}
