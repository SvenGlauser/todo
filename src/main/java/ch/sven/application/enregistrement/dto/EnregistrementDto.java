package ch.sven.application.enregistrement.dto;

import ch.sven.application.action.dto.ActionDto;
import ch.sven.application.common.Dto;
import ch.sven.application.utilisateur.dto.UtilisateurDto;
import ch.sven.domain.enregistrement.model.Enregistrement;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Optional;

@Getter
@Setter
@NoArgsConstructor
public class EnregistrementDto extends Dto<Enregistrement> {

    private LocalDate date;
    private UtilisateurDto utilisateur;
    private ActionDto action;

    /**
     * Constructeur paramétré
     * @param enregistrement Enregistrement
     */
    public EnregistrementDto(Enregistrement enregistrement) {
        super(enregistrement);
        this.date = enregistrement.getDate();
        this.utilisateur = Optional.of(enregistrement.getUtilisateur()).map(UtilisateurDto::new).orElse(null);
        this.action = Optional.of(enregistrement.getAction()).map(ActionDto::new).orElse(null);
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
