package ch.sven.domain.progression.service;

import ch.sven.domain.progression.model.Progression;
import ch.sven.domain.progression.repository.ProgressionRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ProgressionServiceImpl implements ProgressionService {

    private final ProgressionRepository progressionRepository;

    @Override
    public List<Progression> recupererProgressions() {
        return progressionRepository.recupererProgressions();
    }

    @Override
    public Progression sauvegarderProgression(Progression progression) {
        return progressionRepository.sauvegarderProgression(progression);
    }
}
