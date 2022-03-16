package ch.sven.application.action.dto;

import ch.sven.application.common.Dto;
import ch.sven.domain.action.model.Action;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ActionDto extends Dto<Action> {

    private String nom;
    private String description;

    /**
     * Constructeur paramétré
     * @param action Tâche
     */
    public ActionDto(Action action) {
        super(action);
        this.nom = action.getNom();
        this.description = action.getDescription();
    }

    @Override
    public Action toDomaineEntity() {
        Action action = new Action();
        action.setNom(this.nom);
        action.setDescription(this.description);
        return action;
    }
}
