package ch.sven.domain.utilisateur.service;

import ch.sven.domain.utilisateur.model.Utilisateur;
import ch.sven.domain.utilisateur.repository.UtilisateurRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;

    @Override
    public List<Utilisateur> recupererUtilisateurs() {
        return utilisateurRepository.recupererUtilisateurs();
    }

    @Override
    public Utilisateur sauvegarderUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.sauvegarderUtilisateur(utilisateur);
    }
}
