package ch.sven.application.enregistrement.web;

import ch.sven.application.configuration.ApiConfig;
import ch.sven.application.enregistrement.dto.EnregistrementDto;
import ch.sven.application.enregistrement.service.EnregistrementServiceApplication;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ApiConfig.API_URL + "/enregistrement")
@AllArgsConstructor
public class EnregistrementController {

    private final EnregistrementServiceApplication enregistrementServiceApplication;

    /**
     * Récupérer la liste de toutes les enregistrements
     * @return Une liste de enregistrements
     */
    @GetMapping
    public List<EnregistrementDto> listEnregistrements() {
        return enregistrementServiceApplication.recupererEnregistrements();
    }

    /**
     * Créer une enregistrement
     * @param enregistrementDto La enregistrement à créer
     * @return La enregistrement qui a été créé
     */
    @PostMapping
    public EnregistrementDto creerEnregistrement(@RequestBody EnregistrementDto enregistrementDto) {
        return enregistrementServiceApplication.sauvegarderEnregistrement(enregistrementDto);
    }

    /**
     * Modifier une enregistrement
     * @param enregistrementDto La enregistrement à modifier
     * @return La enregistrement qui a été modifié
     */
    @PutMapping
    public EnregistrementDto modifierEnregistrement(@RequestBody EnregistrementDto enregistrementDto) {
        return enregistrementServiceApplication.sauvegarderEnregistrement(enregistrementDto);
    }
}
