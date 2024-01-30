package cda.annuaire.model;

import cda.annuaire.model.enums.Type;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Email {
    /**
     * Identifiant de l'email
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Adresse de l'email
     */
    private String address;

    /**
     * Type de l'email (personnel, professionel, etc.)
     */
    @Enumerated(EnumType.STRING)
    private Type type;

    /**
     * Utilisateur auquel l'email est lié
     */
    @ManyToOne
    private User user;
}
