package ch.sven.application.enregistrement.service;

import ch.sven.application.enregistrement.dto.EnregistrementDto;
import ch.sven.domain.enregistrement.service.EnregistrementService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EnregistrementServiceApplicationImpl implements EnregistrementServiceApplication {

    private final EnregistrementService enregistrementService;

    @Override
    public List<EnregistrementDto> recupererEnregistrements() {
        return enregistrementService.recupererEnregistrements().stream().map(EnregistrementDto::new).collect(Collectors.toList());
    }

    @Override
    public EnregistrementDto sauvegarderEnregistrement(EnregistrementDto enregistrementDto) {
        return Optional.ofNullable(enregistrementService.sauvegarderEnregistrement(Optional.ofNullable(enregistrementDto).map(EnregistrementDto::toDomaine).orElse(null))).map(EnregistrementDto::new).orElse(null);
    }
}
