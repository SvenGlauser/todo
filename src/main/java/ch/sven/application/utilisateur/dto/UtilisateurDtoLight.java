package ch.sven.application.utilisateur.dto;

import ch.sven.application.common.Dto;
import ch.sven.domain.utilisateur.model.Utilisateur;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UtilisateurDtoLight extends Dto<Utilisateur> {
    private String username;

    /**
     * Constructeur paramétré
     * @param utilisateur Utilisateur (l'id sera supprimé car il s'agit d'un UtilisateurDtoLight)
     */
    public UtilisateurDtoLight(Utilisateur utilisateur) {
        super(utilisateur);
        this.username = utilisateur.getUsername();
    }

    @Override
    public Utilisateur toDomaineEntity() {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setUsername(this.username);
        return utilisateur;
    }
}
