package ch.sven.domain.tache.model;

import ch.sven.domain.common.Model;
import ch.sven.domain.progression.model.Progression;
import ch.sven.domain.utilisateur.model.Utilisateur;
import lombok.Data;

@Data
public class Tache extends Model {

    private String nom;
    private String description;
    private Utilisateur utilisateur;
    private Progression progression;
}
