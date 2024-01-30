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

    @RequestMapping("/{userId}/emails")
    public List<Email> getEmailList(@PathVariable long userId){
        return emailService.getEmailByUserId(userId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/email/{id}")
    public void deleteEmail(@PathVariable long id){
        emailService.deleteEmail(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/emails")
    public void addEmail(@RequestBody Email email){
        emailService.addEmail(email);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/email/{id}")
    public void updateEmail(@RequestBody Email email, @PathVariable long id){
        emailService.updateEmail(email, id);
    }
}
