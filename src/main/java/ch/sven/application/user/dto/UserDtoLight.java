package ch.sven.application.user.dto;

import ch.sven.application.common.Dto;
import ch.sven.domain.user.model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDtoLight extends Dto<User> {
    private String username;

    /**
     * Constructeur paramétré
     * @param user User (l'id sera supprimé car il s'agit d'un UserDtoLight)
     */
    public UserDtoLight(User user) {
        super(user);
        this.username = user.getUsername();
    }

    @Override
    public User toDomaineEntity() {
        User user = new User();
        user.setUsername(this.username);
        return user;
    }
}
