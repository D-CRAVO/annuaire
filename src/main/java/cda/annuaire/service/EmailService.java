package cda.annuaire.service;

import cda.annuaire.dto.email.EmailDTO;
import cda.annuaire.dto.user.UserDTO;
import cda.annuaire.mapper.EmailMapper;
import cda.annuaire.model.Email;
import cda.annuaire.repository.EmailRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailRepository;

    private final EmailMapper emailMapper = (EmailMapper) Mappers.getMapper(EmailMapper.class);

    @Autowired
    private UserService userService;

    /**
     * Demande la récupération de la liste des emails de l'utilisateur
     * à l'EmailRepository
     * et la converti en liste d'EmailDTO
     *
     * @param userId Identifiant de l'utilisateur
     *
     * @return Liste d'Email de l'utilisateur
     */
    public List<EmailDTO> getEmailByUserId(long userId){
        return emailMapper.map(emailRepository.findEmailByUserId(userId));
    }

    /**
     * Demande la récupération de tous les emails à l'EmailRepository
     * en passant par la liste des utilisateurs
     *
     * @return La liste de tous les emails
     */
    public List<EmailDTO> getAllEmails() {
        List<UserDTO> userDTOs = userService.getUsers();
        List<EmailDTO> emailDTOs = new ArrayList<EmailDTO>();
        for(UserDTO user : userDTOs){
            emailDTOs.add(this.getEmailById(user.getId()));
        }
        return emailDTOs;
    }

    /**
     * Demande la récupération de l'email à l'EmailRepository
     * d'après son identifiant
     *
     * @param id Identifiant de l'email
     * @return L'email
     */
    public EmailDTO getEmailById(long id){
        Email email = emailRepository.findById(id);
        return emailMapper.map(email);
    }

    /**
     * Ajoute un Email à la liste des Email
     *
     * @param emailDTO Email à ajouter
     */
    public void addEmail(EmailDTO emailDTO){
        emailRepository.save(emailMapper.update(emailDTO));
    }

    /**
     * Demande la suppression d'un email d'après son identifiant
     * à l'EmailRepository
     *
     * @param id Identifiant de l'Email
     */
    public void deleteEmail(long id){
        emailRepository.deleteById(id);
    }

    /**
     * Demande la mise à jour de l'email d'après son identifiant
     * à l'EmailRepository
     *
     * @param emailDTO Email à modifier
     * @param id Identifiant de l'Email
     */
    public void updateEmail(EmailDTO emailDTO, long id){
        emailRepository.save(emailMapper.update(emailDTO));
    }
}
