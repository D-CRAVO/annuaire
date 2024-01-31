package cda.annuaire.service;

import cda.annuaire.model.Photo;
import cda.annuaire.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhotoService {

    @Autowired
    PhotoRepository photoRepository;

    public Photo getPhotoByUserId(long userId){
       return  photoRepository.findPhotoByUserId(userId);
    }

    public void deletePhoto(long id){
        photoRepository.deleteById(id);
    }

    public void updatePhoto(Photo photo){
        photoRepository.save(photo);
    }
}
