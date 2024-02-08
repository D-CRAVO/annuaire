package cda.annuaire.dto.phone;

import cda.annuaire.model.enums.Type;

public class PhoneDTO {

    /**
     * Identifiant du téléphone
     */
    private long id;

    /**
     * Numéro de téléphone
     */
    private String number;

    /**
     * Type de téléphone (personnel, professionel, etc.)
     */
    private Type type;
}
