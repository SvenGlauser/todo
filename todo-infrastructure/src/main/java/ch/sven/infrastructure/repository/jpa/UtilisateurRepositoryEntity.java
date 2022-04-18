package ch.sven.infrastructure.repository.jpa;

import ch.sven.infrastructure.entity.UtilisateurEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepositoryEntity extends CrudRepository<UtilisateurEntity, Long> {
    @Query("SELECT utilisateur FROM UtilisateurEntity utilisateur WHERE utilisateur.username = ?1")
    UtilisateurEntity findUser(String username);
}
