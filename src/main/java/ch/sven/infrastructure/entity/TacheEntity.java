package ch.sven.infrastructure.entity;

import ch.sven.domain.tache.model.Tache;
import ch.sven.infrastructure.common.Dao;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Optional;

@Getter
@Setter
@Entity
@Table(name = "TACHE", schema = "TODO")
@NoArgsConstructor
public class TacheEntity extends Dao<Tache> {

    @Column(name = "NOM")
    private String nom;

    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToOne(targetEntity = UserEntity.class)
    @JoinColumn(name = "USER")
    private UserEntity user;

    @ManyToOne(targetEntity = ProgressionEntity.class)
    @JoinColumn(name = "PROGRESSION")
    private ProgressionEntity progression;

    /**
     * Constructeur paramétré
     */
    public TacheEntity(Tache tache) {
        super(tache);
        this.description = tache.getDescription();
        this.nom = tache.getNom();
        this.user = Optional.of(tache.getUser()).map(UserEntity::new).orElse(null);
        this.progression = Optional.of(tache.getProgression()).map(ProgressionEntity::new).orElse(null);
    }

    @Override
    public Tache toDomaineEntity() {
        Tache tache = new Tache();
        tache.setDescription(this.description);
        tache.setNom(this.nom);
        tache.setUser(this.user.toDomaine());
        tache.setProgression(this.progression.toDomaine());
        return tache;
    }
}
