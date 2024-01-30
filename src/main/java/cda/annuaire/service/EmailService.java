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

    public List<Email> getEmailByUserId(long userId){
        return emailRepository.findEmailByUserId(userId);
    }

    public void addEmail(Email email){
        emailRepository.save(email);
    }

    public void deleteEmail(long id){
        emailRepository.deleteById(id);
    }

    public void updateEmail(Email email, long id){
        emailRepository.save(email);
    }
}
