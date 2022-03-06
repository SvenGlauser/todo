package ch.sven.application.status.web;

import ch.sven.application.configuration.ApiConfig;
import ch.sven.application.status.dto.StatusDto;
import ch.sven.application.status.service.StatusServiceApplication;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ApiConfig.API_URL + "/status")
@AllArgsConstructor
public class StatusController {

    private final StatusServiceApplication statusServiceApplication;

    /**
     * Récupérer la liste de tous les status
     * @return Une liste de status
     */
    @GetMapping
    public List<StatusDto> listStatus() {
        return statusServiceApplication.recupererStatus();
    }

    /**
     * Créer un status
     * @param statusDto Le status à créer
     * @return Le status qui a été créé
     */
    @PostMapping
    public StatusDto creerStatus(@RequestBody StatusDto statusDto) {
        return statusServiceApplication.sauvegarderStatus(statusDto);
    }

    /**
     * Modifier un status
     * @param statusDto Le status à modifier
     * @return Le status qui a été modifié
     */
    @PutMapping
    public StatusDto modifierStatus(@RequestBody StatusDto statusDto) {
        return statusServiceApplication.sauvegarderStatus(statusDto);
    }
}
