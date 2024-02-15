package cda.annuaire.controller;

import cda.annuaire.dto.email.EmailDTO;
import cda.annuaire.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    /**
     * Demande la récupération des emails de l'utilisateur à l'EmailService
     * d'après l'identifiant de l'utilisateur
     *
     * @param userId Identifiant de l'utilisateur
     *
     * @return La liste des emails de l'utilisateur
     */
    /*
    @RequestMapping("/{userId}/emails")
    public List<EmailDTO> getEmailList(@PathVariable long userId){
        return emailService.getEmailByUserId(userId);
    }
    */
    /**
     * Demande la récupération d'un email à l'EmailService
     * d'après son identifiant
     *
     * @param id Identifiant de l'email
     * @return L'email
     */
    /*
    @RequestMapping("/email/{id}")
    public EmailDTO getEmailById(@PathVariable long id){
        return emailService.getEmailById(id);
    }
    */
    /*
    @RequestMapping("/emails")
    public List<EmailDTO> getAllEmails(){
        return emailService.getAllEmails();
    }
    */
    /**
     * Demande la suppression de l'email à l'EmailService
     * d'après son identifiant
     *
     * @param id identifiant de l'email
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/email/{id}")
    public void deleteEmail(@PathVariable long id){
        //emailService.deleteEmail(id);
    }

    /**
     * Demande l'ajout d'un email à l'EmailService
     *
     * @param emailDTO Email à ajouter
     */
    /*
    @RequestMapping(method = RequestMethod.POST, value = "/emails")
    public void addEmail(@RequestBody EmailDTO emailDTO){
        emailService.addEmail(emailDTO);
    }
    */
    /**
     * Demande la mise à jour de l'email à l'EmailService
     * d'après son identifiant
     *
     * @param emailDTO Email à mettre à jour
     * @param id Identifiant de l'email
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/email/{id}")
    public void updateEmail(@RequestBody EmailDTO emailDTO, @PathVariable long id){
        //emailService.updateEmail(emailDTO, id);
    }
}
