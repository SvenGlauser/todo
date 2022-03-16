package ch.sven.domain.action.model;

import ch.sven.domain.common.Model;
import lombok.Data;

@Data
public class Action extends Model {

    private String nom;
    private String description;
}
