package cda.annuaire.service;

import cda.annuaire.dto.phone.PhoneDTO;
import cda.annuaire.dto.user.UserDTO;
import cda.annuaire.mapper.PhoneMapper;
import cda.annuaire.model.Phone;
import cda.annuaire.model.User;
import cda.annuaire.repository.PhoneRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PhoneService {

    @Autowired
    private PhoneRepository phoneRepository;

    private final PhoneMapper phoneMapper = (PhoneMapper) Mappers.getMapper(PhoneMapper.class);

    @Autowired
    private UserService userService;

    /**
     * Demande au PhoneRepository de retourner une liste de téléphone
     * d'après l'identifiant d'un utilisateur
     *
     * @param userId Identifiant de l'utilissateur
     * @return La liste de téléphone de l'utilisateur
     */
    public List<PhoneDTO> getPhonesByUserId(long userId){
        return phoneMapper.map(phoneRepository.findByUserId(userId));
    }

    /**
     * Demande au PhoneRepository d'ajouter un téléphone
     *
     * @param phoneDTO Téléphone à ajouter
     */
    public void addPhone(PhoneDTO phoneDTO){
        phoneRepository.save(phoneMapper.update(phoneDTO));
    }

    /**
     * Demande au PhoneRepository la suppression d'un téléphone
     * d'après son identifiant
     *
     * @param id Identifiant du téléphone à supprimer
     */
    public void deletePhone(long id){
        phoneRepository.deleteById(id);
    }

    /**
     * Demande au PhoneRepository la mise à jour d'un téléphone
     *
     * @param phoneDTO Téléphone à mettre à jour
     */
    public void updatePhone(PhoneDTO phoneDTO){
        phoneRepository.save(phoneMapper.update(phoneDTO));
    }

    /**
     * Demande au PhoneRepository de retourner un téléphone
     * d'après son identifiant
     *
     * @param id Identifiant du téléphone à retourner
     * @return Le téléphone à retourner
     */
    public PhoneDTO getPhoneById(long id) { return phoneMapper.map(phoneRepository.findById(id));
    }

    /**
     * Récupère tous les téléphones
     *
     * @return La liste des téléphones
     */
    public List<PhoneDTO> getAllPhones() {
        List<UserDTO> userDTOs = userService.getUsers();
        List<PhoneDTO> phoneDTOs = new ArrayList<PhoneDTO>();
        for(UserDTO user : userDTOs){
            phoneDTOs.add(this.getPhoneById(user.getId()));
        }
        return phoneDTOs;
    }
}
