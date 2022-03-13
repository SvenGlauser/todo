package ch.sven.infrastructure.repository.utilisateur;

import ch.sven.domain.utilisateur.repository.UtilisateurRepository;
import ch.sven.infrastructure.entity.UtilisateurEntity;
import ch.sven.infrastructure.repository.jpa.UtilisateurRepositoryEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class UtilisateurRepositoryImpl implements UtilisateurRepository {

    private final UtilisateurRepositoryEntity utilisateurRepository;

    @Override
    public List<UtilisateurEntity> recupererUtilisateurs() {
        return StreamSupport.stream(utilisateurRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public UtilisateurEntity sauvegarderUtilisateur(UtilisateurEntity utilisateurEntity) {
        return utilisateurRepository.save(utilisateurEntity);
    }
}
