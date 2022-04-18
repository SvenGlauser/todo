package ch.sven.infrastructure.repository.utilisateur;

import ch.sven.domain.utilisateur.model.Utilisateur;
import ch.sven.domain.utilisateur.repository.UtilisateurRepository;
import ch.sven.infrastructure.entity.UtilisateurEntity;
import ch.sven.infrastructure.repository.jpa.UtilisateurRepositoryEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Repository
@AllArgsConstructor
public class UtilisateurRepositoryImpl implements UtilisateurRepository {

    private final UtilisateurRepositoryEntity utilisateurRepository;

    @Override
    public List<Utilisateur> recupererUtilisateurs() {
        return StreamSupport.stream(utilisateurRepository.findAll().spliterator(), false).map(UtilisateurEntity::toDomaine).collect(Collectors.toList());
    }

    @Override
    public Utilisateur recupererUtilisateur(String username) {
        return Optional.of(utilisateurRepository.findUser(username)).map(UtilisateurEntity::toDomaine).orElse(null);
    }

    @Override
    public Utilisateur sauvegarderUtilisateur(Utilisateur utilisateur) {
        return Optional.of(utilisateurRepository.save(Optional.of(utilisateur).map(UtilisateurEntity::new).orElse(null))).map(UtilisateurEntity::toDomaine).orElse(null);
    }
}
