package ch.sven.infrastructure.entity;

import ch.sven.domain.utilisateur.model.Utilisateur;
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
@Table(name = "UTILISATEUR", schema = "analytics")
@NoArgsConstructor
public class UtilisateurEntity extends Dao<Utilisateur> {

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @OneToMany(mappedBy = "utilisateur")
    private Set<EnregistrementEntity> enregistrements;

    /**
     * Constructeur paramétré
     */
    public UtilisateurEntity(Utilisateur utilisateur) {
        super(utilisateur);
        this.username = utilisateur.getUsername();
        this.password = utilisateur.getPassword();
    }

    @Override
    public Utilisateur toDomaineEntity() {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setUsername(this.username);
        utilisateur.setPassword(this.password);
        return utilisateur;
    }
}
