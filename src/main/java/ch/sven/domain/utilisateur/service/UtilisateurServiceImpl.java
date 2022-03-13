package ch.sven.domain.utilisateur.service;

import ch.sven.domain.utilisateur.model.Utilisateur;
import ch.sven.domain.utilisateur.repository.UtilisateurRepository;
import ch.sven.infrastructure.entity.UtilisateurEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;

    @Override
    public List<Utilisateur> recupererUtilisateurs() {
        return utilisateurRepository.recupererUtilisateurs().stream().map(UtilisateurEntity::toDomaine).collect(Collectors.toList());
    }

    @Override
    public Utilisateur sauvegarderUtilisateur(Utilisateur utilisateur) {
        return Optional.ofNullable(utilisateurRepository.sauvegarderUtilisateur(Optional.of(utilisateur).map(UtilisateurEntity::new).orElse(null))).map(UtilisateurEntity::toDomaine).orElse(null);
    }
}
