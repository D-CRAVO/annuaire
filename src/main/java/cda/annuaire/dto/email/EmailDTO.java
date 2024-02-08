package cda.annuaire.dto.email;

import cda.annuaire.model.enums.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class EmailDTO {

    /**
     * Identifiant de l'email
     */
    private long id;

    /**
     * Adresse de l'email
     */
    private String address;

    /**
     * Type de l'email (personal, professional, etc.)
     */
    private Type type;
}
