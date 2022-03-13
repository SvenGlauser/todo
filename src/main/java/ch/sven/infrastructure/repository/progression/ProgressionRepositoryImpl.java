package ch.sven.infrastructure.repository.progression;

import ch.sven.domain.progression.repository.ProgressionRepository;
import ch.sven.infrastructure.entity.ProgressionEntity;
import ch.sven.infrastructure.repository.jpa.ProgressionRepositoryEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class ProgressionRepositoryImpl implements ProgressionRepository {

    private final ProgressionRepositoryEntity progressionRepository;

    @Override
    public List<ProgressionEntity> recupererProgressions() {
        return StreamSupport.stream(progressionRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public ProgressionEntity sauvegarderProgression(ProgressionEntity progressionEntity) {
        return progressionRepository.save(progressionEntity);
    }
}
