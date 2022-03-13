package ch.sven.domain.utilisateur.model;

import ch.sven.domain.common.Model;
import lombok.Data;

@Data
public class Utilisateur extends Model {

    private String username;
    private String password;
}
