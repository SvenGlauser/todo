package ch.sven.domain.action.service;

import ch.sven.domain.action.model.Action;
import ch.sven.domain.action.repository.ActionRepository;
import ch.sven.infrastructure.entity.ActionEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ActionServiceImpl implements ActionService {

    private final ActionRepository actionRepository;

    @Override
    public List<Action> recupererActions() {
        return actionRepository.recupererActions().stream().map(ActionEntity::toDomaine).collect(Collectors.toList());
    }

    @Override
    public Action sauvegarderAction(Action action) {
        return Optional.ofNullable(actionRepository.sauvegarderAction(Optional.ofNullable(action).map(ActionEntity::new).orElse(null))).map(ActionEntity::toDomaine).orElse(null);
    }
}
