package cda.annuaire.dto.user;

import cda.annuaire.dto.email.EmailDTO;
import cda.annuaire.dto.phone.PhoneDTO;
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
    private List<PhoneDTO> phones;

    /**
     * Liste des emails de l'utilisateur
     */
    private List<EmailDTO> emails;

    /**
     * Photo de l'utilisateur
     */
    private Photo photo;
}
