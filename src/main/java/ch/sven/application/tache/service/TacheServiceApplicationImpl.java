package ch.sven.application.tache.service;

import ch.sven.application.tache.dto.TacheDto;
import ch.sven.domain.tache.service.TacheService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TacheServiceApplicationImpl implements TacheServiceApplication {

    private final TacheService tacheService;

    @Override
    public List<TacheDto> recupererTaches() {
        return tacheService.recupererTaches().stream().map(TacheDto::new).collect(Collectors.toList());
    }

    @Override
    public TacheDto sauvegarderTache(TacheDto tacheDto) {
        return Optional.ofNullable(tacheService.sauvegarderTache(Optional.ofNullable(tacheDto).map(TacheDto::toDomaine).orElse(null))).map(TacheDto::new).orElse(null);
    }
}
