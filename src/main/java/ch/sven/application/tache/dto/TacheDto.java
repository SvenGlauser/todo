package ch.sven.application.tache.dto;

import ch.sven.application.common.Dto;
import ch.sven.application.progression.dto.ProgressionDto;
import ch.sven.application.user.dto.UserDto;
import ch.sven.domain.tache.model.Tache;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@NoArgsConstructor
public class TacheDto extends Dto<Tache> {
    private String nom;
    private String description;
    private UserDto user;
    private ProgressionDto progression;

    /**
     * Constructeur paramétré
     * @param tache Tâche
     */
    public TacheDto(Tache tache) {
        super(tache);
        this.nom = tache.getNom();
        this.description = tache.getDescription();
        this.user = Optional.of(tache.getUser()).map(UserDto::new).orElse(null);
        this.progression = Optional.of(tache.getProgression()).map(ProgressionDto::new).orElse(null);
    }

    @Override
    public Tache toDomaineEntity() {
        Tache tache = new Tache();
        tache.setNom(this.nom);
        tache.setDescription(this.description);
        tache.setUser(this.user.toDomaine());
        tache.setProgression(this.progression.toDomaine());
        return tache;
    }
}
