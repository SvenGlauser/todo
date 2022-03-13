package ch.sven.application.progression.web;

import ch.sven.application.configuration.ApiConfig;
import ch.sven.application.progression.dto.ProgressionDto;
import ch.sven.application.progression.service.ProgressionServiceApplication;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ApiConfig.API_URL + "/progression")
@AllArgsConstructor
public class ProgressionController {

    private final ProgressionServiceApplication progressionServiceApplication;

    /**
     * Récupérer la liste de toutes les progressions
     * @return Une liste de progressions
     */
    @GetMapping
    public List<ProgressionDto> listProgressions() {
        return progressionServiceApplication.recupererProgressions();
    }

    /**
     * Créer une progression
     * @param progressionDto La progression à créer
     * @return La progression qui a été créé
     */
    @PostMapping
    public ProgressionDto creerProgression(@RequestBody ProgressionDto progressionDto) {
        return progressionServiceApplication.sauvegarderProgression(progressionDto);
    }

    /**
     * Modifier une progression
     * @param progressionDto La progression à modifier
     * @return La progression qui a été modifié
     */
    @PutMapping
    public ProgressionDto modifierProgression(@RequestBody ProgressionDto progressionDto) {
        return progressionServiceApplication.sauvegarderProgression(progressionDto);
    }
}
