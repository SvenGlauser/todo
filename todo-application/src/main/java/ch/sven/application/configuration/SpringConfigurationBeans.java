package ch.sven.application.configuration;

import ch.sven.domain.progression.repository.ProgressionRepository;
import ch.sven.domain.progression.service.ProgressionService;
import ch.sven.domain.progression.service.ProgressionServiceImpl;
import ch.sven.domain.tache.repository.TacheRepository;
import ch.sven.domain.tache.service.TacheService;
import ch.sven.domain.tache.service.TacheServiceImpl;
import ch.sven.domain.utilisateur.repository.UtilisateurRepository;
import ch.sven.domain.utilisateur.service.UtilisateurService;
import ch.sven.domain.utilisateur.service.UtilisateurServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigurationBeans {
    /**
     * Créer UtilisateurService Bean
     * @param utilisateurRepository UtilisateurRepository
     * @return UtilisateurServiceImpl
     */
    @Bean
    public UtilisateurService utilisateurServiceBean(UtilisateurRepository utilisateurRepository) {
        return new UtilisateurServiceImpl(utilisateurRepository);
    }

    /**
     * Créer TacheService Bean
     * @param tacheRepository TacheRepository
     * @return TacheServiceImpl
     */
    @Bean
    public TacheService tacheServiceBean(TacheRepository tacheRepository) {
        return new TacheServiceImpl(tacheRepository);
    }

    /**
     * Créer ProgressionService Bean
     * @param progressionRepository ProgressionRepository
     * @return ProgressionServiceImpl
     */
    @Bean
    public ProgressionService progressionServiceBean(ProgressionRepository progressionRepository) {
        return new ProgressionServiceImpl(progressionRepository);
    }
}
