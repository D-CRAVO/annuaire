package cda.annuaire.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Entity
@Component
@Table(name = "a_user")
public class User {

    /**
     * Identifiant de l'utilisateur
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Prénom de l'utilisateur
     */
    private String firstname;

    /**
     * Nom de famille de l'utilisateur
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
     *
     */
    private String city;
}
