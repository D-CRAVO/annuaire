package cda.annuaire.service;

import cda.annuaire.dto.email.EmailDTO;
import cda.annuaire.dto.phone.PhoneDTO;
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
     * Récupère la liste des Email de l'utilisateur
     *
     * @param userId Identifiant de l'utilisateur
     *
     * @return Liste d'Email de l'utilisateur
     */
    public List<EmailDTO> getEmailByUserId(long userId){
        return emailMapper.map(emailRepository.findEmailByUserId(userId));
    }

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
     * Supprime un Email d'après son identifiant
     *
     * @param id identifiant de l'Email
     */
    public void deleteEmail(long id){
        emailRepository.deleteById(id);
    }

    /**
     * Met à jour l'Email d'après son identifiant
     *
     * @param emailDTO Email à modifier
     * @param id Identifiant de l'Email
     */
    public void updateEmail(EmailDTO emailDTO, long id){
        emailRepository.save(emailMapper.update(emailDTO));
    }
}
