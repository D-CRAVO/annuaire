package cda.annuaire.dto.user;

import cda.annuaire.model.Email;
import cda.annuaire.model.Phone;
import cda.annuaire.model.Photo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class UserDTO {

    /**
     * Identifiant de l'utilisateur
     */
    private long id;

    /**
     * Prénom de l'utilisateur
     */
    private String firstname;

    /**
     * Nom de l'utilisateur
     */
    private String lastname;

    /**
     * Adresse de l'utilisateur
     */
    private String address;

    /**
     * Code postal de l'utilisateur
     */
    private String zipCode;

    /**
     * Ville de l'utilisateur
     */
    private String city;

    /**
     * Liste des téléphones de l'utilisateur
     */
    private List<Phone> phones;

    /**
     * Liste des emails de l'utilisateur
     */
    private List<Email> emails;

    /**
     * Photo de l'utilisateur
     */
    private Photo photo;
}
