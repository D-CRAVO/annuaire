package cda.annuaire.repository;

import cda.annuaire.model.Email;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmailRepository extends ListCrudRepository<Email, Long> {

    /**
     * Récupère la liste des emails dans la base de données
     * d'après l'identifiant de l'utilisateur
     *
     * @param userId Identifiant de l'utilisateur
     *
     * @return Liste des Emails de l'utilisateur
     */
    public List<Email> findEmailByUserId(long userId);

    /**
     * Récupère l'email dans la base de données
     * d'après son identifiant
     *
     * @param id Identifiant de l'email
     * @return L'email
     */
    public Email findById(long id);
}
