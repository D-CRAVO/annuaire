package cda.annuaire.dto.email;

import cda.annuaire.model.enums.Type;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class EmailDTO {

    /**
     * Identifiant de l'email
     */
    private Long id;

    /**
     * Addresse de l'email
     */
    private String address;

    /**
     * Type de l'email (personnel, professionel, etc.)
     */
    @Enumerated(EnumType.STRING)
    private Type type;
}
