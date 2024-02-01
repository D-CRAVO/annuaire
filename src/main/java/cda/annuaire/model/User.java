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
    @Column(columnDefinition = "TEXT")
    private String firstname;

    /**
     * Nom de famille de l'utilisateur
     */
    @Column(columnDefinition = "TEXT", nullable = false)
    private String lastname;

    /**
     * Adresse de l'utilisateur
     */
    @Column(columnDefinition = "TEXT")
    private String address;

    /**
     * Code postal de l'utilisateur
     */
    @Column(columnDefinition = "TEXT")
    private String zipCode;

    /**
     * Ville de l'utilisateur
     *
     */
    @JoinColumn(columnDefinition = "TEXT")
    private String city;
}
