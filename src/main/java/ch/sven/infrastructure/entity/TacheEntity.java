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

    @ManyToOne(targetEntity = ProgressionEntity.class)
    @JoinColumn(name = "PROGRESSION")
    private ProgressionEntity progression;

    @ManyToOne(targetEntity = UtilisateurEntity.class)
    @JoinColumn(name = "UTILISATEUR")
    private UtilisateurEntity utilisateur;

    /**
     * Constructeur paramétré
     */
    public TacheEntity(Tache tache) {
        super(tache);
        this.description = tache.getDescription();
        this.nom = tache.getNom();
        this.utilisateur = Optional.of(tache.getUtilisateur()).map(UtilisateurEntity::new).orElse(null);
        this.progression = Optional.of(tache.getProgression()).map(ProgressionEntity::new).orElse(null);
    }

    @Override
    public Tache toDomaineEntity() {
        Tache tache = new Tache();
        tache.setDescription(this.description);
        tache.setNom(this.nom);
        tache.setUtilisateur(this.utilisateur.toDomaine());
        tache.setProgression(this.progression.toDomaine());
        return tache;
    }
}
