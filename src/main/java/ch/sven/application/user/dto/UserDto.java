package ch.sven.application.user.dto;

import ch.sven.application.common.Dto;
import ch.sven.domain.user.model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto extends Dto<User> {
    private String username;
    private String password;

    /**
     * Constructeur paramétré
     * @param user User
     */
    public UserDto(User user) {
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
