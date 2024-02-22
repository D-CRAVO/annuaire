package cda.annuaire.repository;

import cda.annuaire.model.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends ListCrudRepository<User, Long> {

    /**
     * Recherche les utilisateurs suivant leur prénom et leur nom
     * en fonction du texte de recherche envoyé par le UserService
     *
     * @param firstname Texte de recherche correspondant au prénom
     * @param lastname Texte de recherche correspondant au nom
     * @return La liste des utilisateurs
     */
    List<User> findByFirstnameContainsOrLastnameContains(String firstname, String lastname);
}
