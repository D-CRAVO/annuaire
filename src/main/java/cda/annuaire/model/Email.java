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
     * Identifiant de l'Email
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Adresse de l'Email
     */
    private String address;

    /**
     * Type de l'Email
     */
    @Enumerated(EnumType.STRING)
    private Type type;

    /**
     * Propriétaire de l'Email
     */
    @ManyToOne
    private User user;
}
