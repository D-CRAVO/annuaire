package cda.annuaire.controller;

import cda.annuaire.model.Email;
import cda.annuaire.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class EmailController {

    @Autowired
    EmailService emailService;

    /**
     * Demande la récupération des emails de l'utilisateur à l'EmailService
     * d'après l'identifiant de l'utilisateur
     *
     * @param userId Identifiant de l'utilisateur
     *
     * @return La liste des emails de l'utilisateur
     */
    @RequestMapping("/{userId}/emails")
    public List<Email> getEmailList(@PathVariable long userId){
        return emailService.getEmailByUserId(userId);
    }

    /**
     * Demande la suppression de l'email à l'EmailService
     * d'après son identifiant
     *
     * @param id identifiant de l'email
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/email/{id}")
    public void deleteEmail(@PathVariable long id){
        emailService.deleteEmail(id);
    }

    /**
     * Demande l'ajout d'un email à l'EmailService
     *
     * @param email Email à ajouter
     */
    @RequestMapping(method = RequestMethod.POST, value = "/emails")
    public void addEmail(@RequestBody Email email){
        emailService.addEmail(email);
    }

    /**
     * Demande la mise à jour de l'email à l'EmailService
     * d'après son identifiant
     *
     * @param email Email à mettre à jour
     * @param id Identifiant de l'email
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/email/{id}")
    public void updateEmail(@RequestBody Email email, @PathVariable long id){
        emailService.updateEmail(email, id);
    }
}
