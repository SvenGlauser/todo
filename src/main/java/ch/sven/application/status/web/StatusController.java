package ch.sven.application.status.web;

import ch.sven.application.configuration.ApiConfig;
import ch.sven.application.status.dto.StatusDto;
import ch.sven.application.status.service.StatusServiceApplication;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ApiConfig.API_URL + "/status")
@AllArgsConstructor
public class StatusController {

    private final StatusServiceApplication statusServiceApplication;

    @GetMapping
    public List<StatusDto> listStatus() {
        return statusServiceApplication.findAll();
    }

    @PostMapping
    public StatusDto createStatus(@RequestBody StatusDto statusDto) {
        return statusServiceApplication.createStatus(statusDto);
    }
}
