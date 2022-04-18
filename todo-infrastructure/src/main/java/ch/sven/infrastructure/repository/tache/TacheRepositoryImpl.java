package ch.sven.infrastructure.repository.tache;

import ch.sven.domain.tache.model.Tache;
import ch.sven.domain.tache.repository.TacheRepository;
import ch.sven.infrastructure.entity.TacheEntity;
import ch.sven.infrastructure.repository.jpa.TacheRepositoryEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Repository
@AllArgsConstructor
public class TacheRepositoryImpl implements TacheRepository {

    private final TacheRepositoryEntity tacheRepository;

    @Override
    public List<Tache> recupererTaches() {
        return StreamSupport.stream(tacheRepository.findAll().spliterator(), false).map(TacheEntity::toDomaine).collect(Collectors.toList());
    }

    @Override
    public Tache sauvegarderTache(Tache tache) {
        return Optional.of(tacheRepository.save(Optional.of(tache).map(TacheEntity::new).orElse(null))).map(TacheEntity::toDomaine).orElse(null);
    }
}
