package ch.sven.application.progression.service;

import ch.sven.application.progression.dto.ProgressionDto;
import ch.sven.domain.progression.service.ProgressionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProgressionServiceApplicationImpl implements ProgressionServiceApplication {

    private final ProgressionService progressionService;

    @Override
    public List<ProgressionDto> recupererProgressions() {
        return progressionService.recupererProgressions().stream().map(ProgressionDto::new).collect(Collectors.toList());
    }

    @Override
    public ProgressionDto sauvegarderProgression(ProgressionDto progressionDto) {
        return Optional.ofNullable(progressionService.sauvegarderProgression(Optional.ofNullable(progressionDto).map(ProgressionDto::toDomaine).orElse(null))).map(ProgressionDto::new).orElse(null);
    }
}
