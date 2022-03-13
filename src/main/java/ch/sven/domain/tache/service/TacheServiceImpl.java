package ch.sven.domain.tache.service;

import ch.sven.domain.tache.model.Tache;
import ch.sven.infrastructure.entity.TacheEntity;
import ch.sven.domain.tache.repository.TacheRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TacheServiceImpl implements TacheService {

    private final TacheRepository tacheRepository;

    @Override
    public List<Tache> recupererTaches() {
        return tacheRepository.recupererTaches().stream().map(TacheEntity::toDomaine).collect(Collectors.toList());
    }

    @Override
    public Tache sauvegarderTache(Tache tache) {
        return Optional.ofNullable(tacheRepository.sauvegarderTache(Optional.ofNullable(tache).map(TacheEntity::new).orElse(null))).map(TacheEntity::toDomaine).orElse(null);
    }
}
