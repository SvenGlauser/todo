package ch.sven.application.status.web;

import ch.sven.application.configuration.ApiConfig;
import ch.sven.domain.status.model.Status;
import ch.sven.domain.task.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
@RequestMapping(name = ApiConfig.API_URL)
public class StatusController {

    @GetMapping("/status")
    public Set<Status> listStatus() {
        return null;
    }
}
