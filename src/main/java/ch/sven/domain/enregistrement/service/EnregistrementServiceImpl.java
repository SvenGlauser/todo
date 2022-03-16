package ch.sven.domain.enregistrement.service;

import ch.sven.domain.enregistrement.model.Enregistrement;
import ch.sven.domain.enregistrement.repository.EnregistrementRepository;
import ch.sven.infrastructure.entity.EnregistrementEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EnregistrementServiceImpl implements EnregistrementService {

    private final EnregistrementRepository enregistrementRepository;

    @Override
    public List<Enregistrement> recupererEnregistrements() {
        return enregistrementRepository.recupererEnregistrements().stream().map(EnregistrementEntity::toDomaine).collect(Collectors.toList());
    }

    @Override
    public Enregistrement sauvegarderEnregistrement(Enregistrement enregistrement) {
        return Optional.ofNullable(enregistrementRepository.sauvegarderEnregistrement(Optional.ofNullable(enregistrement).map(EnregistrementEntity::new).orElse(null))).map(EnregistrementEntity::toDomaine).orElse(null);
    }
}
