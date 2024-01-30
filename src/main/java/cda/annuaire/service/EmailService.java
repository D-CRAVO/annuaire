package cda.annuaire.service;

import cda.annuaire.model.Email;
import cda.annuaire.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {

    @Autowired
    EmailRepository emailRepository;

    /**
     * Récupère la liste des Email de l'utilisateur
     *
     * @param userId Identifiant de l'utilisateur
     *
     * @return Liste d'Email de l'utilisateur
     */
    public List<Email> getEmailByUserId(long userId){
        return emailRepository.findEmailByUserId(userId);
    }

    /**
     * Ajoute un Email à la liste des Email
     *
     * @param email Email à ajouter
     */
    public void addEmail(Email email){
        emailRepository.save(email);
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
     * @param email Email à modifier
     * @param id Identifiant de l'Email
     */
    public void updateEmail(Email email, long id){
        emailRepository.save(email);
    }
}
