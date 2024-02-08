package cda.annuaire.controller;

import cda.annuaire.dto.photo.PhotoDTO;
import cda.annuaire.model.Photo;
import cda.annuaire.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class PhotoController {

    @Autowired
    PhotoService photoService;

    /**
     * Demande la récupération de la photo auprès du PhotoService
     * d'après l'identifiant de l'utilisateur
     *
     * @param userId Identifiant de l'utilisateur
     * @return La photo
     */
    @RequestMapping("/{userId}/photo")
    public PhotoDTO getPhotoByUserId(@PathVariable long userId){
        return photoService.getPhotoByUserId(userId);
    }

    /**
     * Demande la suppression de la photo auprès du PhotoService
     * d'après son identifiant
     *
     * @param id Identifiant de la photo
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/photo/{id}")
    public void deletePhoto(@PathVariable long id){
        photoService.deletePhoto(id);
    }

    /**
     * Demande la mise à jour de la photo auprès du PhotoService
     *
     * @param photoDTO Photo à mettre à jour
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/photo")
    public void updatePhoto(PhotoDTO photoDTO){
        photoService.updatePhoto(photoDTO);
    }
}
