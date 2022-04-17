package ch.sven.application.configuration;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import javax.sql.DataSource;
import java.util.List;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final DataSource datasource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Load CORS configuration with @Bean of corsConfigurationSource()
        http.cors();

        http.csrf().disable();

        // Enable Basic Auth
        http.authorizeRequests().anyRequest().authenticated().and().httpBasic();

        // Interdire la création de session
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }

    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowedOrigins(List.of("*"));
        config.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        source.registerCorsConfiguration("/**", config);
        return source;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(datasource)
                .usersByUsernameQuery(getUserRequest())
                .authoritiesByUsernameQuery(getRoleRequest());
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    private static String getRoleRequest() {
        return "SELECT u.username, role.role\n" +
                "FROM todo.role\n" +
                "INNER JOIN todo.role_utilisateur ru on role.id = ru.role\n" +
                "INNER JOIN todo.utilisateur u on u.id = ru.utilisateur\n" +
                "WHERE u.username = ?";
    }

    private static String getUserRequest() {
        return "SELECT username, password, enabled\n" +
                "FROM todo.utilisateur\n" +
                "WHERE username = ?";
    }
}