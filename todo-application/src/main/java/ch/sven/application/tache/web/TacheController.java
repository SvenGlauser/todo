package ch.sven.application.tache.web;

import ch.sven.application.configuration.ApiConfig;
import ch.sven.application.tache.dto.TacheDto;
import ch.sven.application.tache.service.TacheServiceApplication;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ApiConfig.API_URL + "/taches")
@AllArgsConstructor
public class TacheController {

    private final TacheServiceApplication tacheServiceApplication;

    /**
     * Récupérer la liste des tâches
     * @return Une liste de tâche
     */
    @GetMapping
    public List<TacheDto> recupererTaches() {
        return tacheServiceApplication.recupererTaches();
    }

    /**
     * Créer une tâche
     * @param tacheDto Tâche à créé
     * @return La tâche créé
     */
    @PostMapping
    public TacheDto creerTache(@RequestBody TacheDto tacheDto) {
        return tacheServiceApplication.sauvegarderTache(tacheDto);
    }

    /**
     * Modifier une tâche
     * @param tacheDto Tâche à modifier
     * @return La tâche modifier
     */
    @PutMapping
    public TacheDto modifierTache(@RequestBody TacheDto tacheDto) {
        return tacheServiceApplication.sauvegarderTache(tacheDto);
    }
}
