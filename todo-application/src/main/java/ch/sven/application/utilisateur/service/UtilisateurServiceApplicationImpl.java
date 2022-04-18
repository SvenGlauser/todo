package ch.sven.application.utilisateur.service;

import ch.sven.application.utilisateur.dto.UtilisateurDto;
import ch.sven.application.utilisateur.dto.UtilisateurDtoLight;
import ch.sven.domain.utilisateur.service.UtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UtilisateurServiceApplicationImpl implements UtilisateurServiceApplication {

    private final UtilisateurService utilisateurService;

    @Override
    public List<UtilisateurDtoLight> recupererUtilisateurs() {
        return utilisateurService.recupererUtilisateurs().stream().map(UtilisateurDtoLight::new).collect(Collectors.toList());
    }

    @Override
    @PreAuthorize("@securityMethods.isLoggedUser(#username)")
    public UtilisateurDtoLight recupererUtilisateur(String username) {
        return Optional.ofNullable(utilisateurService.recupererUtilisateur(username)).map(UtilisateurDtoLight::new).orElse(null);
    }

    @Override
    public UtilisateurDto sauvegarderUtilisateur(UtilisateurDto utilisateurDto) {
        return Optional.ofNullable(utilisateurService.sauvegarderUtilisateur(utilisateurDto.toDomaine())).map(UtilisateurDto::new).orElse(null);
    }
}
