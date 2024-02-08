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

    @RequestMapping("/{userId}/photo")
    public PhotoDTO getPhotoByUserId(@PathVariable long userId){
        return photoService.getPhotoByUserId(userId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/photo/{id}")
    public void deletePhoto(@PathVariable long id){
        photoService.deletePhoto(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/photo")
    public void updatePhoto(PhotoDTO photoDTO){
        photoService.updatePhoto(photoDTO);
    }
}
