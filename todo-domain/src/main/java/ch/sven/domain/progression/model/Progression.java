package ch.sven.domain.progression.model;

import ch.sven.domain.common.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Progression extends Model {

    private String nom;
    private String description;
}
