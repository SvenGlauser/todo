package ch.sven.domain.enregistrement.model;

import ch.sven.domain.action.model.Action;
import ch.sven.domain.common.Model;
import ch.sven.domain.utilisateur.model.Utilisateur;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Enregistrement extends Model {

    private LocalDate date;
    private Utilisateur utilisateur;
    private Action action;
}
