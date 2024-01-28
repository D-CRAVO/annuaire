package cda.annuaire.service;

import cda.annuaire.model.Phone;
import cda.annuaire.model.User;
import cda.annuaire.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService {

    @Autowired
    PhoneRepository phoneRepository;

    public List<Phone> getPhonesByUserId(long userId){
        return phoneRepository.findByUserId(userId);
    }

    public void addPhone(Phone phone){
        phoneRepository.save(phone);
    }

    public void deletePhone(long id){
        phoneRepository.deleteById(id);
    }

    public void updatePhone(Phone phone, long id){
        phoneRepository.save(phone);
    }
}
