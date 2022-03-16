package ch.sven.infrastructure.repository.action;

import ch.sven.domain.action.repository.ActionRepository;
import ch.sven.infrastructure.entity.ActionEntity;
import ch.sven.infrastructure.repository.jpa.ActionRepositoryEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class ActionRepositoryImpl implements ActionRepository {

    private final ActionRepositoryEntity actionRepository;

    @Override
    public List<ActionEntity> recupererActions() {
        return StreamSupport.stream(actionRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public ActionEntity sauvegarderAction(ActionEntity actionEntity) {
        return actionRepository.save(actionEntity);
    }
}
