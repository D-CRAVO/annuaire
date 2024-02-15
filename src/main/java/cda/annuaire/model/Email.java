package cda.annuaire.model;

import cda.annuaire.model.enums.Type;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Entity
@Component
public class Email {
    /**
     * Identifiant de l'email
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Adresse de l'email
     */
    @Column(columnDefinition = "TEXT", nullable = false)
    private String address;

    /**
     * Type de l'email (personnel, professionel, etc.)
     */
    @Enumerated(EnumType.STRING)
    private Type type;

    /**
     * Utilisateur auquel l'email est lié
     */
    //@JoinColumn(columnDefinition = "BIGINT", name = "user_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
