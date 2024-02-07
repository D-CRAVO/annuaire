package cda.annuaire.controller;

import cda.annuaire.model.Phone;
import cda.annuaire.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class PhoneController {

    @Autowired
    PhoneService phoneService;

    /**
     * Demande la récupération des téléphones d'un utilisateur au PhoneService
     * d'après l'identifiant de l'utilisateur
     *
     * @param userId Identifiant de l'utilisateur
     *
     * @return La liste des téléphone de l'utilisateur
     */
    @RequestMapping("/{userId}/phones")
    public List<Phone> getPhoneList(@PathVariable Long userId){
        return phoneService.getPhonesByUserId(userId);
    }

    /**
     * Demande la récupération d'un téléphone au PhoneService
     * d'après son identifiant
     *
     * @param id Identifiant du téléphone à récupérer
     *
     * @return Le téléphone
     */
    @RequestMapping("/phones/{id}")
    public Phone getPhoneById(@PathVariable Long id){
        return phoneService.getPhoneById(id);
    }

    /**
     * Demande la suppression d'un téléphone au PhoneService
     * d'après son identifiant
     *
     * @param id identifiant du téléphone à supprimer
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/phone/{id}")
    public void deletePhone(@PathVariable long id){
        phoneService.deletePhone(id);
    }

    /**
     * Demande l'ajout d'un téléphone au PhoneService
     *
     * @param phone Téléphone à ajouter
     */
    @RequestMapping(method = RequestMethod.POST, value = "/phones")
    public void addPhone(@RequestBody Phone phone){
        phoneService.addPhone(phone);
    }

    /**
     * Demande la mise à jour d'un téléphone au PhoneService
     * d'après son identifiant
     *
     * @param phone Téléphone à modifier
     * @param id Identifiant du téléphone à modifier
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/phone/{id}")
    public void updatePhone(@RequestBody Phone phone, @PathVariable long id){
        phoneService.updatePhone(phone, id);
    }
}
