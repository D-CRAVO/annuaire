package cda.annuaire.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import net.sf.jsqlparser.statement.create.table.ColumnDefinition;
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
    @Column(columnDefinition = "TEXT", nullable = false)
    private String file;

    /**
     * Utilisateur auquel la photo est liée
     */
    @JoinColumn(columnDefinition = "BIGINT")
    @OneToOne
    private User user;
}
