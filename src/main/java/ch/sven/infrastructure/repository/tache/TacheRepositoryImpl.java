package ch.sven.infrastructure.repository.tache;

import ch.sven.domain.tache.repository.TacheRepository;
import ch.sven.infrastructure.entity.TacheEntity;
import ch.sven.infrastructure.repository.jpa.TacheRepositoryEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class TacheRepositoryImpl implements TacheRepository {

    private final TacheRepositoryEntity tacheRepository;

    @Override
    public List<TacheEntity> recupererTaches() {
        return StreamSupport.stream(tacheRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public TacheEntity sauvegarderTache(TacheEntity tacheEntity) {
        return tacheRepository.save(tacheEntity);
    }
}
