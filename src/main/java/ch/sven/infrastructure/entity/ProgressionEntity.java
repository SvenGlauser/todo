package ch.sven.infrastructure.entity;

import ch.sven.domain.progression.model.Progression;
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
@Table(name = "PROGRESSION", schema = "TODO")
@NoArgsConstructor
public class ProgressionEntity extends Dao<Progression> {

    @Column(name = "NOM")
    private String nom;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany(mappedBy = "progression")
    private Set<TacheEntity> taches;

    public ProgressionEntity(Progression progression) {
        super(progression);
        this.description = progression.getDescription();
        this.nom = progression.getNom();
    }

    @Override
    public Progression toDomaineEntity() {
        Progression progression = new Progression();
        progression.setNom(this.nom);
        progression.setDescription(this.description);
        return progression;
    }
}
