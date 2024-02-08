package cda.annuaire.dto.user;

import org.springframework.stereotype.Component;

@Component
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
}
