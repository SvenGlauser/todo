package ch.sven.infrastructure.entity;

import ch.sven.domain.action.model.Action;
import ch.sven.infrastructure.common.Dao;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "ACTION", schema = "analitycs")
@NoArgsConstructor
public class ActionEntity extends Dao<Action> {

    @Column(name = "NOM")
    private String nom;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany(mappedBy = "action")
    private Set<EnregistrementEntity> enregistrements;

    /**
     * Constructeur paramétré
     */
    public ActionEntity(Action action) {
        super(action);
        this.description = action.getDescription();
        this.nom = action.getNom();
    }

    @Override
    public Action toDomaineEntity() {
        Action action = new Action();
        action.setDescription(this.description);
        action.setNom(this.nom);
        return action;
    }
}
