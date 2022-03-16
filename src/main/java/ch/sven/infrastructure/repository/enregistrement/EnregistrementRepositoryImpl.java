package ch.sven.infrastructure.repository.enregistrement;

import ch.sven.domain.enregistrement.repository.EnregistrementRepository;
import ch.sven.infrastructure.entity.EnregistrementEntity;
import ch.sven.infrastructure.repository.jpa.EnregistrementRepositoryEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class EnregistrementRepositoryImpl implements EnregistrementRepository {

    private final EnregistrementRepositoryEntity enregistrementRepository;

    @Override
    public List<EnregistrementEntity> recupererEnregistrements() {
        return StreamSupport.stream(enregistrementRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public EnregistrementEntity sauvegarderEnregistrement(EnregistrementEntity enregistrementEntity) {
        return enregistrementRepository.save(enregistrementEntity);
    }
}
