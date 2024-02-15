package cda.annuaire.dto.phone;

import cda.annuaire.model.User;
import cda.annuaire.model.enums.Type;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PhoneDTO {

    /**
     * Identifiant du téléphone
     */
    private Long id;

    /**
     * Numéro de téléphone
     */
    private String number;

    /**
     * Type de téléphone (personnel, professionel, etc.)
     */
    @Enumerated(EnumType.STRING)
    private Type type;
}
