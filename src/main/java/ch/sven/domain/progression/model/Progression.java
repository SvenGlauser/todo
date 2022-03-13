package ch.sven.domain.progression.model;

import ch.sven.domain.common.Model;
import lombok.Data;

@Data
public class Progression extends Model {

    private String nom;
    private String description;
}
