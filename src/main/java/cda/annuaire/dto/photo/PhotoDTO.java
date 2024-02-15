package cda.annuaire.dto.photo;

import cda.annuaire.model.User;

public class PhotoDTO {

    /**
     * Identifiant de la photo
     */
    private Long id;

    /**
     * Fichier de la photo
     */
    private String file;

    /**
     * Utilisateur auquel la photo est liée
     */
    private User user;
}
