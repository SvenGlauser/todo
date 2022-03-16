package ch.sven.application.action.service;

import ch.sven.application.action.dto.ActionDto;
import ch.sven.domain.action.service.ActionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ActionServiceApplicationImpl implements ActionServiceApplication {

    private final ActionService actionService;

    @Override
    public List<ActionDto> recupererActions() {
        return actionService.recupererActions().stream().map(ActionDto::new).collect(Collectors.toList());
    }

    @Override
    public ActionDto sauvegarderAction(ActionDto actionDto) {
        return Optional.ofNullable(actionService.sauvegarderAction(Optional.ofNullable(actionDto).map(ActionDto::toDomaine).orElse(null))).map(ActionDto::new).orElse(null);
    }
}
