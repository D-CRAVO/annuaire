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
public class Phone {

    /**
     * Identifiant du téléphone
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Numéro de téléphone
     */
    @Column(columnDefinition = "TEXT", nullable = false)
    private String number;

    /**
     * Type de téléphone (personnel, professionel, etc)
     */
    @Enumerated(EnumType.STRING)
    private Type type;

    /**
     * Utilisateur auquel le téléphone est lié
     */
    @JoinColumn(columnDefinition = "BIGINT", name = "user_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
