package ch.sven.domain.utilisateur.model;

import ch.sven.domain.common.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Utilisateur extends Model {

    private String username;
    private String password;
}
