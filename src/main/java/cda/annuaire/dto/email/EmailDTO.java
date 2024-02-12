package cda.annuaire.dto.email;

import cda.annuaire.model.User;
import cda.annuaire.model.enums.Type;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
public class EmailDTO {

    /**
     * Identifiant de l'email
     */
    private long id;

    /**
     * Addresse de l'email
     */
    private String address;

    /**
     * Type de l'email (personnel, professionel, etc.)
     */
    @Enumerated(EnumType.STRING)
    private Type type;

    /**
     * Utilisateur avec lequel l'email est lié
     */
    private User user;
}
