package ch.sven.application.utilisateur.web;

import ch.sven.application.configuration.ApiConfig;
import ch.sven.application.utilisateur.dto.UtilisateurDto;
import ch.sven.application.utilisateur.dto.UtilisateurDtoLight;
import ch.sven.application.utilisateur.service.UtilisateurServiceApplication;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ApiConfig.API_URL + "/utilisateurs")
@AllArgsConstructor
public class UtilisateurController {

    private final UtilisateurServiceApplication utilisateurServiceApplication;

    /**
     * Récupérer la liste des utilisateurs
     * @return Une liste de UtilisateurDto
     */
    @GetMapping
    public List<UtilisateurDtoLight> recupererUtilisateurs() {
        return utilisateurServiceApplication.recupererUtilisateurs();
    }

    /**
     * Créer un utilisateur
     * @param utilisateurDto L'utilisateur à créer
     * @return L'utilisateur créé
     */
    @PostMapping
    public UtilisateurDto creerUtilisateur(@RequestBody UtilisateurDto utilisateurDto) {
        return utilisateurServiceApplication.sauvegarderUtilisateur(utilisateurDto);
    }

    /**
     * Créer un utilisateur
     * @param utilisateurDto L'utilisateur à créer
     * @return L'utilisateur créé
     */
    @PutMapping
    public UtilisateurDto modifierUtilisateur(@RequestBody UtilisateurDto utilisateurDto) {
        return utilisateurServiceApplication.sauvegarderUtilisateur(utilisateurDto);
    }
}
