package ch.sven.domain.progression.service;

import ch.sven.domain.progression.model.Progression;
import ch.sven.infrastructure.entity.ProgressionEntity;
import ch.sven.domain.progression.repository.ProgressionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProgressionServiceImpl implements ProgressionService {

    private final ProgressionRepository progressionRepository;

    @Override
    public List<Progression> recupererProgressions() {
        return progressionRepository.recupererProgressions().stream().map(ProgressionEntity::toDomaine).collect(Collectors.toList());
    }

    @Override
    public Progression sauvegarderProgression(Progression progression) {
        return Optional.ofNullable(progressionRepository.sauvegarderProgression(Optional.ofNullable(progression).map(ProgressionEntity::new).orElse(null))).map(ProgressionEntity::toDomaine).orElse(null);
    }
}
