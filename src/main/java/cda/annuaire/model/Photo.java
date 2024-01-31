package cda.annuaire.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Entity
@Component
public class Photo {

    /**
     * Identifiant de la photo
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Fichier de l'image
     */
    @Lob //LOB or Large OBject refers to a variable-length datatype for storing large objects.
    @Column(columnDefinition = "BYTEA")
    private byte[] file;

    /**
     * Utilisateur auquel la photo est liée
     */
    @OneToOne
    private User user;
}
