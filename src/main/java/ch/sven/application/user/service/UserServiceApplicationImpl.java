package ch.sven.application.user.service;

import ch.sven.application.user.dto.UserDto;
import ch.sven.application.user.dto.UserDtoLight;
import ch.sven.domain.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceApplicationImpl implements UserServiceApplication {

    private final UserService userService;

    @Override
    public List<UserDtoLight> recupererUsers() {
        return userService.recupererUsers().stream().map(UserDtoLight::new).collect(Collectors.toList());
    }

    @Override
    public UserDto sauvegarderUser(UserDto userDto) {
        return Optional.ofNullable(userService.sauvegarderUser(userDto.toDomaine())).map(UserDto::new).orElse(null);
    }
}
