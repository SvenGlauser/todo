package ch.sven.infrastructure.repository.progression;

import ch.sven.domain.progression.model.Progression;
import ch.sven.domain.progression.repository.ProgressionRepository;
import ch.sven.infrastructure.entity.ProgressionEntity;
import ch.sven.infrastructure.repository.jpa.ProgressionRepositoryEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Repository
@AllArgsConstructor
public class ProgressionRepositoryImpl implements ProgressionRepository {

    private final ProgressionRepositoryEntity progressionRepository;

    @Override
    public List<Progression> recupererProgressions() {
        return StreamSupport.stream(progressionRepository.findAll().spliterator(), false).map(ProgressionEntity::toDomaine).collect(Collectors.toList());
    }

    @Override
    public Progression sauvegarderProgression(Progression progression) {
        return Optional.of(progressionRepository.save(Optional.of(progression).map(ProgressionEntity::new).orElse(null))).map(ProgressionEntity::toDomaine).orElse(null);
    }
}
