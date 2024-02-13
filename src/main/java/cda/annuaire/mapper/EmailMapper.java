package cda.annuaire.mapper;

import cda.annuaire.dto.email.EmailDTO;
import cda.annuaire.model.Email;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface EmailMapper {

    /**
     * Converti l'email en emailDTO
     *
     * @param email Email à convertir
     * @return Un emailDTO
     */
    EmailDTO map(Email email);

    /**
     * Converti la liste d'email en liste d'emailDTO
     *
     * @param emails Liste d'email à convertir
     * @return Une liste d'emailDTO
     */
    List<EmailDTO> map(List<Email> emails);

    /**
     * Met à jour l'email à partir de l'emailDTO
     *
     * @param emailDTO EmailDTO à partir duquel la mise à jour est faite
     * @return L'email mis à jour
     */
    Email update(EmailDTO emailDTO);

    /**
     * Met à jour la liste d'email à partir de la liste d'emailDTO
     *
     * @param emailDTOs Liste d'emailDTO à partir de laquelle la mise à jour est faite
     * @return La liste d'email mise à jour
     */
    List<Email> update(List<EmailDTO> emailDTOs);
}
