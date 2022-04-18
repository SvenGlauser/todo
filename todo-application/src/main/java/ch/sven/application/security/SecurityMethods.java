package ch.sven.application.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SecurityMethods {

    public static boolean isLoggedUser(String username) {
        return username == null || username.equals(getUser().getUsername());
    }

    public static User getUser() {
        User user = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof User)
            user = (User) principal;

        return user;
    }
}
