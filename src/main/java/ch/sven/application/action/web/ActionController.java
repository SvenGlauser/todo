package ch.sven.application.action.web;

import ch.sven.application.action.dto.ActionDto;
import ch.sven.application.action.service.ActionServiceApplication;
import ch.sven.application.configuration.ApiConfig;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ApiConfig.API_URL + "/actions")
@AllArgsConstructor
public class ActionController {

    private final ActionServiceApplication actionServiceApplication;

    /**
     * Récupérer la liste des tâches
     * @return Une liste de tâche
     */
    @GetMapping
    public List<ActionDto> recupererActions() {
        return actionServiceApplication.recupererActions();
    }

    /**
     * Créer une tâche
     * @param actionDto Tâche à créé
     * @return La tâche créé
     */
    @PostMapping
    public ActionDto creerAction(@RequestBody ActionDto actionDto) {
        return actionServiceApplication.sauvegarderAction(actionDto);
    }

    /**
     * Modifier une tâche
     * @param actionDto Tâche à modifier
     * @return La tâche modifier
     */
    @PutMapping
    public ActionDto modifierAction(@RequestBody ActionDto actionDto) {
        return actionServiceApplication.sauvegarderAction(actionDto);
    }
}
