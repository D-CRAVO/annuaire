package cda.annuaire.repository;

import cda.annuaire.model.Email;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmailRepository extends ListCrudRepository<Email, Long> {

    /**
     *
     * @param id Identifiant de l'Email
     *
     * @return Liste des Emails de l'utilisateur
     */
    public List<Email> findEmailByUserId(long id);
}
