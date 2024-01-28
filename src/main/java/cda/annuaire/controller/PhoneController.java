package cda.annuaire.controller;

import cda.annuaire.model.Phone;
import cda.annuaire.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class PhoneController {

    @Autowired
    PhoneService phoneService;

    @RequestMapping("/{userId}/phones")
    public List<Phone> getPhoneList(@PathVariable Long userId){
        return phoneService.getPhonesByUserId(userId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/phone/{id}")
    public void deletePhone(@PathVariable long id){
        phoneService.deletePhone(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/phones")
    public void addPhone(@RequestBody Phone phone){
        phoneService.addPhone(phone);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/phone/{id}")
    public void updatePhone(@RequestBody Phone phone, @PathVariable long id){
        phoneService.updatePhone(phone, id);
    }
}
