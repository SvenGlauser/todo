package ch.sven.application.utilisateur.dto;

import ch.sven.application.common.Dto;
import ch.sven.domain.utilisateur.model.Utilisateur;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UtilisateurDto extends Dto<Utilisateur> {
    private String username;
    private String password;

    /**
     * Constructeur paramétré
     * @param utilisateur Utilisateur
     */
    public UtilisateurDto(Utilisateur utilisateur) {
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
