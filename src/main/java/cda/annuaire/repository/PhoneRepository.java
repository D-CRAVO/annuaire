package cda.annuaire.repository;

import cda.annuaire.model.Phone;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneRepository extends ListCrudRepository<Phone, Long> {

    /**
     * Récupère les téléphones dans la base de données
     * d'après l'identifiant de l'utilisateur
     *
     * @param userId Identifiant de l'utilisateur
     *
     * @return Les téléphones de l'utilisateur
     */
    List<Phone> findByUserId(long userId);

    /**
     * Récupère le téléphone dans la base de données
     * d'après son identifiant
     *
     * @param id Identifiant du téléphone
     *
     * @return Le téléphone
     */
    Phone findById(long id);
}
