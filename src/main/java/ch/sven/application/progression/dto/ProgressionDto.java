package ch.sven.application.progression.dto;

import ch.sven.application.common.Dto;
import ch.sven.domain.progression.model.Progression;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProgressionDto extends Dto<Progression> {
    private String nom;
    private String description;

    /**
     * Constructeur paramétré
     * @param progression Progression
     */
    public ProgressionDto(Progression progression) {
        super(progression);
        this.nom = progression.getNom();
        this.description = progression.getDescription();
    }

    @Override
    public Progression toDomaineEntity() {
        Progression progression = new Progression();
        progression.setNom(this.nom);
        progression.setDescription(this.description);
        return progression;
    }
}
