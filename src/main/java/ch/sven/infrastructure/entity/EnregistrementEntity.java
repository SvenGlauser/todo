package ch.sven.infrastructure.entity;

import ch.sven.domain.enregistrement.model.Enregistrement;
import ch.sven.infrastructure.common.Dao;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Optional;

@Getter
@Setter
@Entity
@Table(name = "ENREGISTREMENT", schema = "analitycs")
@NoArgsConstructor
public class EnregistrementEntity extends Dao<Enregistrement> {

    @Column(name = "DATE")
    private LocalDate date;

    @ManyToOne(targetEntity = ActionEntity.class)
    @JoinColumn(name = "ACTION")
    private ActionEntity action;

    @ManyToOne(targetEntity = UtilisateurEntity.class)
    @JoinColumn(name = "UTILISATEUR")
    private UtilisateurEntity utilisateur;

    public EnregistrementEntity(Enregistrement enregistrement) {
        super(enregistrement);
        this.date = enregistrement.getDate();
        this.utilisateur = Optional.of(enregistrement.getUtilisateur()).map(UtilisateurEntity::new).orElse(null);
        this.action = Optional.of(enregistrement.getAction()).map(ActionEntity::new).orElse(null);
    }

    @Override
    public Enregistrement toDomaineEntity() {
        Enregistrement enregistrement = new Enregistrement();
        enregistrement.setDate(this.date);
        enregistrement.setUtilisateur(this.utilisateur.toDomaine());
        enregistrement.setAction(this.action.toDomaine());
        return enregistrement;
    }
}
