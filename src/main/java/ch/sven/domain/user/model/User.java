package ch.sven.domain.user.model;

import ch.sven.domain.common.Model;
import lombok.Data;

@Data
public class User extends Model {

    private String username;
    private String password;
}
