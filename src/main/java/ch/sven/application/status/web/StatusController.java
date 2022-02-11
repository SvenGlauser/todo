package ch.sven.application.status.web;

import ch.sven.application.configuration.ApiConfig;
import ch.sven.application.status.dto.StatusDto;
import ch.sven.application.status.service.StatusServiceApplicationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = ApiConfig.API_URL)
public class StatusController {

    @Autowired
    private StatusServiceApplicationImpl statusServiceApplication;

    @GetMapping("/status")
    public List<StatusDto> listStatus() {
        return statusServiceApplication.findAll();
    }
}
