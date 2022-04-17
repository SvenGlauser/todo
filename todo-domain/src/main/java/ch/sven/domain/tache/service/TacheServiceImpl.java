package ch.sven.domain.tache.service;

import ch.sven.domain.tache.model.Tache;
import ch.sven.domain.tache.repository.TacheRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class TacheServiceImpl implements TacheService {

    private final TacheRepository tacheRepository;

    @Override
    public List<Tache> recupererTaches() {
        return tacheRepository.recupererTaches();
    }

    @Override
    public Tache sauvegarderTache(Tache tache) {
        return tacheRepository.sauvegarderTache(tache);
    }
}
